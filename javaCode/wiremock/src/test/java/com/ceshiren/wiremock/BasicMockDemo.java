/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */

package com.ceshiren.wiremock;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import org.junit.jupiter.api.Test;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;

public class BasicMockDemo {


    @Test
    void baseMockTest() throws InterruptedException {
        //启动服务的端口号
        WireMockServer wireMockServer = new WireMockServer(wireMockConfig().port(8089)); //No-args constructor will start on port 8080, no HTTPS
//        WireMockServer wireMockServer1 = new WireMockServer(8089); //No-args constructor will start on port 8080, no HTTPS

        wireMockServer.start();
        configureFor(8089);
// 做一些业务请求逻辑

        //请求路径为 /wiremock
        //页面显示内容为：this is a mock server
        stubFor(get(urlEqualTo("/wiremock"))
                .willReturn(aResponse().withBody("this is a mock server"))

        );
        Thread.sleep(999999);



        WireMock.reset();

// 完成之后
        wireMockServer.stop();
    }

    @Test
    void baseMock404Test() throws InterruptedException {
        //启动服务的端口号
        WireMockServer wireMockServer = new WireMockServer(wireMockConfig().port(8089)); //No-args constructor will start on port 8080, no HTTPS
//        WireMockServer wireMockServer1 = new WireMockServer(8089); //No-args constructor will start on port 8080, no HTTPS

        wireMockServer.start();
        configureFor(8089);
// 做一些业务请求逻辑

        //请求路径为 /wiremock
        //页面显示内容为：this is a mock server
        stubFor(get(urlEqualTo("/wiremock"))
                .willReturn(aResponse().withStatus(404).withBody("this is a mock server 404"))

        );
        Thread.sleep(999999);



        WireMock.reset();

// 完成之后
        wireMockServer.stop();
    }
}
