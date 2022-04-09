## selenium架构
![](./image/selenium架构.png)
### 核心组件
* selenium webdriver client
* selenium drivers
* selenium IDE
* selenium grid
## 安装配置
* 安装浏览器
* 安装selenium driver，并放入Path变量中
  * [安装地址](https://www.selenium.dev/documentation/webdriver/getting_started/install_drivers/)
* 安装selenium-client
* 安装selenium ide
## selenium ide
### 下载、安装
Chrome插件： https://chrome.google.com/webstore/detail/selenium-ide/mooikfkahbdckldjndioackbalphokd   
Firefox插件： https://addons.mozilla.org/en-US/firefox/addon/selenium-ide/   
github release： https://github.com/SeleniumHQ/selenium-ide/releases   
其它版本： https://addons.mozilla.org/en-GB/firefox/addon/selenium-ide/versions/   
注意:Chrome插件在国内无法下载，Firefox可以直接下载。
### 启动 ide
* 安装完成后，通过在浏览器的菜单栏中点击它的图标来启动它：
* 如果没看到图标，首先确保是否安装了Selenium IDE扩展插件
* 通过以下链接访问所有插件 
  * Chrome: chrome://extensions 
  * Firefox: about:addons
### ide的使用
#### 录制第一个用例
* 创建新项目后，系统将提示为其命名
* 然后要求提供URL：要录制测试脚本的网站URL。设置一次就可以在整个项目的所有测试中使用
* 在页面的操作都将记录在IDE中。操作完成后，请切换到IDE窗口，并单击停止录制图标：
* 停止后，我们为刚录制的Test取名
#### 图示
![](./image/seleniumIDE.png)
* 1.新建、保存、打开
* 2.开始和停止录制
* 3.运行8中的所有的实例
* 4.运行单个实例
* 5.调试模式
* 6.调整案例的运行速度
* 7.要录制的网址
* 8.实例列表
* 9.动作、目标、值
* 10.对单条命令的解释
* 11.运行日志
#### 管理用例
* Suites： 
  * 当Test越来越多时，可以将多个Test归类到Suites中，Suites就像小柜子。 
  * 创建项目时，IDE会创建一个默认Suite，并将第一个Test添加到其中，你可以点击Test，在下拉菜单中选中Test suites进入Suites管理界面。 
  * 首先进入Suites管理界面，点击+，提供名称，然后单击add。 
  * 将鼠标悬停在suite1上，点击三个点弹出Suites管理菜单。 
  * 可以对suite1进行管理，包括添加test，重命名，删除，设置，导出。
#### 保存和回放
* 保存 
  * 单击IDE右上角的save图标，输入项目的保存名称和地址。 
* 回放 
  * 选择想要播放的Test或Suite，单击play按钮，在IDE中播放测试。测试将在浏览器中回放，如果录制时窗口仍然打开，它将用于回放。否则，将打开并使用一个新窗口
#### 扩展
* 代码导出：
https://selenium.dev/selenium-ide/docs/en/introduction/code-export
* 常见问题：
https://selenium.dev/selenium-ide/docs/en/introduction/faq
## selenium 测试用例编写
