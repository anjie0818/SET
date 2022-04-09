package com.example.wiremock;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.common.FileSource;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.github.tomakehurst.wiremock.extension.Parameters;
import com.github.tomakehurst.wiremock.extension.ResponseTransformer;
import com.github.tomakehurst.wiremock.extension.responsetemplating.ResponseTemplateTransformer;
import com.github.tomakehurst.wiremock.http.Request;
import com.github.tomakehurst.wiremock.http.Response;
import org.junit.Test;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;

public class BaseMock {
    /**
     * 创建一个伪服务
     * 请求本地端口8089
     * 请求路径为 /wiremock
     * 页面显示内容为：this is a mock server
     * @throws InterruptedException
     */
    @Test
    public void test1() throws InterruptedException {
        WireMockServer wireMockServer = new WireMockServer(wireMockConfig().port(8089));

        wireMockServer.start();
        configureFor(8089);

        stubFor(get(urlEqualTo("/wiremock"))
                .willReturn(aResponse().withBody("this is a mock server"))
        );
        Thread.sleep(100000);
        WireMock.reset();
        wireMockServer.stop();
    }

    /**
     * 创建一个伪服务
     * 请求本地端口 8089
     * 请求路径为 /wiremock
     * 状态码为 404
     * 页面显示内容为：this is a mock server 404
     */
    @Test
    public void test2() throws InterruptedException {
        WireMockServer wireMockServer = new WireMockServer(wireMockConfig().port(8089));

        wireMockServer.start();
        configureFor(8089);

        stubFor(get(urlEqualTo("/wiremock"))
                .willReturn(aResponse()
                        .withBody("this is a mock server")
                        .withStatus(404)
                )
        );
        Thread.sleep(100000);
        WireMock.reset();
        wireMockServer.stop();
    }
    /**
     * 发一个请求
     * 请求里面匹配：
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
    @Test
    public void test3() throws InterruptedException {
        WireMockServer wireMockServer = new WireMockServer(wireMockConfig().port(8089));

        wireMockServer.start();
        configureFor(8089);

        stubFor(get(urlPathEqualTo("/wiremock"))
                .withHeader("Accept",containing("xml"))
                .withCookie("session",matching(".*12345.*"))
                .withQueryParam("search_term",equalTo("WireMock"))
                .withBasicAuth("anjiework@gmail.com","password")
                .withRequestBody(matchingJsonPath("$.a",equalTo("1")))
                .willReturn(aResponse().withStatus(200).withBody("this is a mock server"))
        );
        Thread.sleep(100000);
        WireMock.reset();
        wireMockServer.stop();
    }

    /**
     *  多个请求，返回类型
     *  请求列表：
     *          http://localhost:8089/__admin/
     */
    @Test
    public void test4() throws InterruptedException {
        WireMockServer wireMockServer = new WireMockServer(wireMockConfig().port(8089));

        wireMockServer.start();
        configureFor(8089);

        stubFor(get(urlEqualTo("/wiremock/resp"))
                .willReturn(
                        aResponse()
                                .withStatus(404)
                                .withHeader("Content-Type","text/plain")
                                .withBody("hello wiremock responsemath!")
                )

        );

        stubFor(get("/fine-with-body")
                .willReturn(ok("body content"))
        );
        stubFor(get("/json")
                .willReturn(okJson("{\"message\":\"ok\"}"))
        );
        stubFor(get("annother")
                .willReturn(temporaryRedirect("/new/place"))
        );
        stubFor(get("/new/place")
                .willReturn(okJson("{\"message\":\"302 local\"}"))
        );
        stubFor(get("/sorry-no")
                .willReturn(unauthorized())
        );
        stubFor(get("/status-only")
                .willReturn(status(418))
        );
        Thread.sleep(100000);
        WireMock.reset();
        wireMockServer.stop();
    }

    /**
     * api优先级
     */
    @Test
    public void test5() throws InterruptedException {
        WireMockServer wireMockServer = new WireMockServer(wireMockConfig().port(8089));

        wireMockServer.start();
        configureFor(8089);

        //通过atPriority()方法来设置stub的匹配优先级，数字越小优先级越高
        stubFor(get(urlMatching("/api/.*")).atPriority(5)
                .willReturn(aResponse().withStatus(200).withBody("ddd")));

        //Specific case
        stubFor(get(urlEqualTo("/api/specific-resource")).atPriority(1) //1 is highest
                .willReturn(aResponse()
                        .withStatus(200)
                        .withBody("Resource state")));
        //Catch-all case
        stubFor(any(anyUrl()).atPriority(10)
                .willReturn(aResponse()
                        .withStatus(401)
                        .withBody("no mathing!")
                ));

        Thread.sleep(100000);
        WireMock.reset();
        wireMockServer.stop();
    }

    /**
     * proxy
     */
    @Test
    public void test6() throws InterruptedException {
        WireMockServer wireMockServer = new WireMockServer(
                wireMockConfig()
                        .port(8089)
                        .extensions(new ResponseTemplateTransformer(true)
                                ,
                                new ResponseTransformer() {
                                    @Override
                                    public String getName() {
                                        return "ResponseTransformerDemo";
                                    }
                                    //通过重写transform方法，可以对透传后返回的response进行修改
                                    @Override
                                    public Response transform(Request request, Response response, FileSource fileSource, Parameters parameters) {
                                        String body=response.getBodyAsString();
                                        return Response.Builder.like(response)
                                                .body(response.getBodyAsString().replace("Other Utilities", "Other Utilities-this is proxy!"))
                                                .build();
                                    }
                                }
                        )
        );
        wireMockServer.start();
        configureFor(8089);
        stubFor(get(urlMatching(".*"))
                .willReturn(
                        aResponse()
                                //通过proxiedFrom()方法使stub匹配到的请求，可以透传到真正的后端
                                .proxiedFrom("https://httpbin.ceshiren.com")
                )
        );
        Thread.sleep(100000);
        WireMock.reset();
        wireMockServer.stop();
    }
}
