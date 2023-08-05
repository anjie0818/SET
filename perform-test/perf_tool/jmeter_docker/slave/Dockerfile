# Use vinsdocker base image
FROM anjiedocker/jmbase
MAINTAINER anjie

# Ports to be exposed from the container for JMeter Slaves/Server
EXPOSE 1099 50000

# Application to run on starting the container
# Dserver.rmi.localport ：JMeter 进程之间通过 RMI 连接进行通信和协调。
#    当一个 JMeter 节点需要与另一个 JMeter 节点进行通信时，它将通过 RMI 协议向目标节点发出请求，
#    并在指定的端口上监听响应
#    -Dserver.rmi.localport  ——> 表示slave server启动显示的端口
#    -Dserver_port           ——> 表示master机器要远程连接的端口   即 remote_hosts=xxxx:8899
ENTRYPOINT $JMETER_HOME/bin/jmeter-server \
                        -Dserver.rmi.ssl.disable=true \
                        -Dserver.rmi.localport=50000 \
                        -Dserver_port=1099

