todo:
1、课程笔记整理
2、历史笔记整理
3、实现jmeter maven插件的分布式压测
## Jmeter分布式
* 单机发压能力有限
* 被压系统还没到瓶颈，发压机能力不足了
### RMI（Remote Method Invocation）原理

### cli帮助 jmeter -h
```bash
WARNING: package sun.awt.X11 not in java.desktop
    _    ____   _    ____ _   _ _____       _ __  __ _____ _____ _____ ____
   / \  |  _ \ / \  / ___| | | | ____|     | |  \/  | ____|_   _| ____|  _ \
  / _ \ | |_) / _ \| |   | |_| |  _|    _  | | |\/| |  _|   | | |  _| | |_) |
 / ___ \|  __/ ___ \ |___|  _  | |___  | |_| | |  | | |___  | | | |___|  _ <
/_/   \_\_| /_/   \_\____|_| |_|_____|  \___/|_|  |_|_____| |_| |_____|_| \_\ 5.5

Copyright (c) 1999-2022 The Apache Software Foundation


To list all command line options, open a command prompt and type:

jmeter.bat(Windows)/jmeter.sh(Linux) -?

--------------------------------------------------

To run Apache JMeter in GUI mode, open a command prompt and type:

jmeter.bat(Windows)/jmeter.sh(Linux) [-p property-file]

--------------------------------------------------

To run Apache JMeter in NON_GUI mode:
Open a command prompt (or Unix shell) and type:

jmeter.bat(Windows)/jmeter.sh(Linux) -n -t test-file [-p property-file] [-l results-file] [-j log-file]

--------------------------------------------------

To run Apache JMeter in NON_GUI mode and generate a report at end :
Open a command prompt (or Unix shell) and type:

jmeter.bat(Windows)/jmeter.sh(Linux) -n -t test-file [-p property-file] [-l results-file] [-j log-file] -e -o [Path to output folder]

--------------------------------------------------
To generate a Report from existing CSV file:
Open a command prompt (or Unix shell) and type:

jmeter.bat(Windows)/jmeter.sh(Linux) -g [csv results file] -o [path to output folder (empty or not existing)]

--------------------------------------------------

To tell Apache JMeter to use a proxy server:
Open a command prompt and type:

jmeter.bat(Windows)/jmeter.sh(Linux) -H [your.proxy.server] -P [your proxy server port]

---------------------------------------------------

To run Apache JMeter in server mode:
Open a command prompt and type:

jmeter-server.bat(Windows)/jmeter-server(Linux)

---------------------------------------------------

```
### Jmeter命令行传参
```sh
# step1:传参数使用-J+变量名称
jmeter -Jurl=localhost -Jport=8080 -n -t test.jmx -l result.jtl
# step2:jmx使用：${__P(变量名称，默认值)}
```
### 分布式压测实战(docker)
#### 压测模拟图
![](https://jmeter.apache.org/images/screenshots/distributed-jmeter.svg)
#### docker编写
* step1:编写+构建基础镜像
  * [baseDockerfile](./jmeter_docker/base/Dockerfile)
  * 构建镜像：docker build --build-arg JMETER_VERSION=5.5 -t anjiedocker/jmbase .
* step2:编写+构建master镜像
  * [masterDockerfile](./jmeter_docker/master/Dockerfile)
  * 构建镜像：docker build -t anjiedocker/jmmaster .
* step3:编写+构建slave镜像
  * [slaveDockerfile](./jmeter_docker/slave/Dockerfile)
  * 构建镜像：docker build -t anjiedocker/jmserver .
#### 启动容器
* slave
  *  docker run -dit --name slave01 anjiedocker/jmserver /bin/bash
  *  docker run -dit --name slave02 anjiedocker/jmserver /bin/bash
  *  docker run -dit --name slave03 anjiedocker/jmserver /bin/bash
* master
  * sudo docker run -dit --name master anjiedocker/jmmaster /bin/bash
#### 运行以下命令来获取这些容器的 IP 地址列表。
 docker inspect --format '{{ .Name }} => {{ .NetworkSettings.IPAddress }}' $( docker ps -a -q)
#### 复制文件到容器内
docker exec -i master sh -c 'cat > /jmeter/apache-jmeter-5.5/bin/docker-test.jmx' < order_auto_nocsv.jmx
#### 执行
* master执行
  * jmeter -n -t docker-test.jmx  -l result.jtl -L DEBUG
* 分布式执行
  * jmeter -n -t docker-test.jmx -R172.17.0.5,172.17.0.3,172.17.0.4 -Dserver.rmi.ssl.disable=true -L DEBUG
#### Tips
* 可以在一台机器上运行多个 jmeter 服务器实例以产生更多负载！不，这是不行的。这根本没有帮助。事实上，一个 JMeter 实例比在同一主机上运行多个 JMeter 实例能够产生更多的负载
* docker容器的肉鸡：jmeter日志文件在根目录下（tail -f jmeter-server.log）
* 除了jmx文件外，其他配置文件肉鸡上面都必须得有
## BeanShell组件分类
* BeanShell前置处理器
* BeanShell取样器
  * https://jmeter.apache.org/usermanual/component_reference.html#BeanShell_Sampler
* BeanShell后置处理器
* BeanShell断言
* BeanShell监听
  * https://jmeter.apache.org/usermanual/component_reference.html#BeanShell_Listener
* BeanShell定时器
### 使用方法
* Jmeter中直接使用BeanShell代码
* 引用外部代码
### BeanShell内置对象
* 内置对象--log
  * $jmeter_path/bin/jmeter.log中
  * log.info();
* 内置对象--vars
  * vars.put(String key,String value)
  * vars.get(String key)
* 内置对象--props
  * props.get(sampleresult.defalut.encoding)
* 内置对象--prev
  * 获取前面采样器响应返回值 
  * eg:prev.getResponseCode()
  * https://jmeter.apache.org/api/org/apache/jmeter/samplers/SampleResult.html
* 内置对象--bsh.args
  * 获取当前beanshell运行的传人参数
  * eg：引用变量bsh.args[0],bsh.args[1]
### 自定义jar包倒入
> jmeter中beanShell调试成本高，因此可以使用idea中编写java文件，然后倒入jmeter中来引用
#### 导入jar包的三种方式
* Test Plan-> add directory or jar to classpath
* jar包放置到Jmeter的lib目录，或者ext目录下
* 设计插件依赖路径，jmeter.properties中添加依赖
### 运行junit测试用例

