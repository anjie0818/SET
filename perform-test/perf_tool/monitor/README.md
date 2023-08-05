## 性能监控平台好处
### 1.JMeter原生测试测试报告带来的“痛苦”
* 不具备实时性
* 报告中的数据是测试时间段内的平均值
* 长相问题(原生报告较丑)
### 2.性能监控平台的优势
* 实时展示JMeter压测数据
* 数据范围可选
* 界面更友好
### 3.JMeter性能监控平台组成
* JMeter：压测工具，产生压测数据
* InfluxDB: 开源时序数据库，特别适合用于处理和分析资源监控数据，用于存储压测数据
* Grafana：度量分析与可视化图标展示工具，可以支持不用种类的数据源，用于将存储于InfluxDB中的数据以图表的形式展示出来
### 4.搭建
#### InfluxDB安装配置
```bash
# InfluxDB安装
#启动命令 -d(后台运行)
docker run -d -p 8086:8086 -p 8083:8083 --name=<your influx db name> influxdb:1.8
#进入Docker container
docker exec –it <your influx db name> bash 
#命令进入命令台
influx
#创建jmeter数据库：
create database jmeter;
show databases;
use jmeter;
select * from jmeter;
```
#### Jmeter配置
* 添加JMeter backend listener
  * [order_auto_jenkins.jmx](../automation/order_auto_jenkins.jmx)
* 配置 localhost:8086
  * python3 ./application/orderservice.py
  * [orderservice.py](../application/orderservice.py)
* application name: order service
* 运行JMeter压测
  * [order_auto_jenkins.jmx](../automation/order_auto_jenkins.jmx)
* 检验 influx db中是否有数据
#### Grafana安装配置
* 启动docker container
  * docker run -d -p 3000:3000 --name=<your grafana container name> grafana/grafana 
* 登录grafana：http://localhost:3000/
  * 默认用户名 / 密码： admin / admin
* 配置数据源 - influx db
  * URL: http://localhost:8086【注意】本地localhost与代理冲突
  * Access: Browser
  * Database: jmeter
* 添加 Dashboard 模版 
  * 点击【+】；导入json文件
  * [jmeter_dashboard.json](../shell/jmeter_dashboard.json)
* 运行看效果

