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
import static java.lang.Thread.sleep;

public class RequestMockDemo {
    @Test
    void requestMockTest() throws InterruptedException {
        WireMockServer wireMockServer = new WireMockServer(wireMockConfig().port(8089));
        wireMockServer.start();
        configureFor(8089);

        //业务逻辑
        /**
         * header
         * “Accept”, containing(“xml”)
         * cookie
         * “session”, matching(“.12345.”)
         * QueryParam
         * “search_term”, equalTo(“WireMock”)
         * BasicAuth
         * RequestBody
         * matchingJsonPath(“$.a”,equalTo(“1”))
         */
        //希望匹配任何请求方法
        stubFor(any(urlPathEqualTo("/wiremock"))
                .withHeader("Accept",containing("xml"))
                .withCookie("session",matching(".*12345.*"))
                .withQueryParam("search_term",equalTo("WireMock"))
                .withBasicAuth("gaigai@ceshiren.com","hogwarts123")
                .withRequestBody(matchingJsonPath("$.a",equalTo("1")))
                .willReturn(aResponse().withStatus(200).withBody("request mock server!"))

        );



        //强制等待
        sleep(999999);
        WireMock.reset();
        wireMockServer.stop();


    }


    @Test
    void test2() throws InterruptedException {
        WireMockServer wireMockServer = new WireMockServer(wireMockConfig().port(8089));
        wireMockServer.start();
        configureFor(8089);
        stubFor(get(urlEqualTo("/wirmock/resp"))
                .willReturn(
                        aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "text/plain")
                                .withBody("Hello WireMock ResponseMath!")));



        //常见的响应缩写
        stubFor(get("/fine-with-body")
                .willReturn(ok("body content")));

        stubFor(get("/json")
                .willReturn(okJson("{ \"message\": \"Hello\" }")));

        stubFor(get("/annother")
                .willReturn(temporaryRedirect("/new/place")));
        stubFor(get("/new/place")
                .willReturn(okJson("{ \"message\": \"302 local\" }")));

        stubFor(get("/sorry-no")
                .willReturn(unauthorized()));

        stubFor(get("/status-only")
                .willReturn(status(418)));

        stubFor(get("/weather")
                .willReturn(temporaryRedirect("https://restapi.amap.com/v3/weather/weatherInfo?key=9efd073d2026890392a3aa8ff1b018d3&city=110100")));

        stubFor(get(urlPathEqualTo("/weathermock"))
                .withQueryParam("city",equalTo("110"))
                .willReturn(temporaryRedirect("https://restapi.amap.com/v3/weather/weatherInfo?key=9efd073d2026890392a3aa8ff1b018d3&city=130100"))

        );

        //强制等待
        sleep(999999);
        WireMock.reset();
        wireMockServer.stop();

    }


    @Test
    void test3() throws InterruptedException {
        WireMockServer wireMockServer = new WireMockServer(wireMockConfig().port(8089));
        wireMockServer.start();
        configureFor(8089);

        //业务逻辑
        /**
         * /api/*     api demo
         * /api/resource    resource state
         * 其他          no mathing
         */

        stubFor(get(urlMatching("/api/.*")).atPriority(50)
                .willReturn(aResponse().withStatus(200).withBody("api demo"))
        );

        stubFor(get(urlEqualTo("/api/resource")).atPriority(1)
                .willReturn(aResponse().withStatus(200).withBody("resource state"))
        );

        stubFor(any(anyUrl()).atPriority(100)
                .willReturn(aResponse().withStatus(401).withBody("no mathing"))
        );


        //强制等待
        sleep(999999);
        WireMock.reset();
        wireMockServer.stop();
    }
}
