## 性能测试介绍
### 优势
* 为企业降本增效
  * 良好的容量规划能⼒ + 性能调优能⼒ = 为⽼板省钱
* 性能测试能⼒是测开⼯程师精华加分项
### 性能体系
#### 体系介绍
![性能体系.png](..%2Fimages%2F%E6%80%A7%E8%83%BD%E4%BD%93%E7%B3%BB.png)
#### 性能测试模型-曲线拐点模型-压力曲线分析图
![拐点图.png](..%2Fimages%2F%E6%8B%90%E7%82%B9%E5%9B%BE.png)
* 横轴：从左到右表现了Number of Concurrent Users（并发用户数）的不断增长。
* 曲线：分别表示Utilization（资源的利用情况，包括硬件资源和软件资源）、Throughput（吞吐量，这里是指每秒事务数）以及Response Time（响应时间）
* 区域：曲线图主要分为3个区域，分别是：Light Load （轻压力区）、Heavy Load （重压力区）和Buckle Zone（弃忍区）
* The Optimum Number of Concurrent Users（最佳并发用户数）：在Light Load和Heavy Load两个区域交界处的并发用户数；
* The Maximum Number of Concurrent Users（最大并发用户数）：在Heavy Load和Buckle Zone两个区域交界处的并发用户数；
## 行业流行性能压测工具介绍
* Apache AB = Apache HTTP server benchmarking tool
  * 小快灵
  * https://httpd.apache.org/docs/2.4/programs/ab.html
* Jmeter
  * https://jmeter.apache.org/
  * 压测场景支撑：逻辑控制器
  * 压力需求：分布式
  * CI支持：Jmx文件、数据驱动、场景可视化
  * 二次开发：多协议支持
  * 问题支持：开源社区
* nGrinder
  * https://github.com/naver/ngrinder
* Locust
  * https://github.com/locustio/locust
### Jmeter vs Locust
https://www.blazemeter.com/blog/how-to-test-concurrent-users-using-jmeter

## 行业流行性能监控工具介绍
* Linux自带命令：VmStat、Top等
* 机器监控工具：Nmon
* 物理机监控：Collected+InfluxDB+Grafana
* Docker Mysql Redis一体化监控
  * Prometheus+Grafana（node_exporter、mysqlid_exporter、redis_exporter、自定义_exporter）
* 全链路监控工具：Zipkin、Skywalking
## 行业流行性能剖析工具介绍
* JConsole
* JVirusalVM
* JStack
* FlameGraph
  * https://github.com/brendangregg/FlameGraph
* SkyWalking
* Zipkin
## 性能测试流程与方法
### 测试流程
![性能测试流程.png](..%2Fimages%2F%E6%80%A7%E8%83%BD%E6%B5%8B%E8%AF%95%E6%B5%81%E7%A8%8B.png)
### 测试方法
#### 并发模式
并发模式（虚拟⽤户模式） 并发是指虚拟并发⽤户数，从业务⾓度，也可以理解
为同时在线的⽤户数。如果需要从客户端的⾓度出发，摸底业务系统各节点能同
时承载的在线⽤户数，可以使⽤该模式设置⽬标并发。
#### RPS模式（吞吐量模式）
RPS 模式（吞吐量模式） RPS（Requests Per Second）是指每秒请求数。RPS 模
式即“吞吐量模式”，通过设置每秒发出的请求数，从服务端的⾓度出发，直接衡
量系统的吞吐能⼒，免去并发到 RPS 的繁琐转化，⼀步到位。
## 性能测试计划
* 需求分析与测试设计
* 环境设计与搭建
* 测试数据准备
* 性能指标预期设定
* 发压⼯具配置及脚本编写
* 测试执⾏ & 监控
## 性能测试报告
* 背景&方案
* 实际环境
* 压测过程
* 总结&建议
## 性能测试场景设计
1、**负载测试(Load Test)**:负载测试是⼀种性能测试，指数据在 超负荷环境中运
⾏，程序是否能够承担。 关注点:how much   
2、**压⼒测试(Stress Test)**: 压⼒测试(又叫强度测试)也是⼀ 种性能测试，它在系统
资源特别低的情况下软件系统运⾏情况，⽬ 的是找到系统在哪⾥失效以及如何失
效的地⽅。   
3、**极限测试 Extreme testing**:在过量⽤户下的负载测试 Hammer
testing:连续执⾏所有能做的操作   
4、**容量测试(Volume Test)**:确定系统可处理同时在线的最⼤⽤户数
关注点:how much(⽽不是how fast) 容量测试，通常和数据库   
有关，容量和负载的区别在于:容量关注的是⼤容量，⽽不需要关注使⽤中的实际
表现。
![性能测试场景.png](..%2Fimages%2F%E6%80%A7%E8%83%BD%E6%B5%8B%E8%AF%95%E5%9C%BA%E6%99%AF.png)
## 性能测试概念
## 经典技术架构图
![架构图.png](..%2Fimages%2F%E6%9E%B6%E6%9E%84%E5%9B%BE.png)