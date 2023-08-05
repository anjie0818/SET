### 为什么需要 Java Request 呢？
* 不是所有的接口都是 http 协议
* 稀有协议的请求必须定制化用程序开发
* jmx 本质上只是配置文件，不是程序代码
* 团队一起开发jmx 会很头疼，JMeter UI中处理XML冲突
### Java Request 是啥？
* 纯 Java 程序，实现了JMeter中提供接口 – “JavaSamplerClient”
* 将 Java 程序集成到JMeter中，通过Java Request实现调度
* Java 程序实现与压测“目标”的交互
* JMeter 来控制 Java程序的生命周期、并发调度、收集结果等处理
#### 优势
* 自己写程序，流程控制自由、灵活
* 纯代码编程，源码管理方便，容易推进团队合作开发
* 只要Java程序可以实现的就是能够支持的
#### 短板
* 必须学编程
* Java编程，入门曲线稍高，知识积累需要一些时间
### Java Request 代码知识点
* Java Request 的入口类必须继承抽象类：AbstractJavaSamplerClient
* 关于Java Request类中函数的执行顺序
  * getDefaultParameters()
  * setupTest(JavaSamplerContext context)
  * runTest(JavaSamplerContext arg0)
  * teardownTest(JavaSamplerContext arg0)
* 获取JMeter的全局变量函数
  * arg0.getJMeterVariables();
* Java Request 结果变量
  * SampleResult sampleResult = new SampleResult();
* Java Request 结果的成功与失败控制
  * sampleResult.setSuccessful(true);
  * sampleResult.setSuccessful(false);
* Java Request 结果内容数据
  * sampleResult.setResponseData(“”.getBytes());
* Java Request 开始与结束时间
  * sampleResult.sampleStart();
  * sampleResult.sampleEnd();
