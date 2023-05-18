/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */

package com.ceshiren.wiremock;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.common.FileSource;
import com.github.tomakehurst.wiremock.extension.Parameters;
import com.github.tomakehurst.wiremock.extension.ResponseTransformer;
import com.github.tomakehurst.wiremock.http.Request;
import com.github.tomakehurst.wiremock.http.Response;
import org.junit.jupiter.api.Test;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static java.lang.Thread.sleep;

public class ProxyWeatherDemo {

    @Test
    void proxyWeather() throws InterruptedException {
        int port = 8089;
        WireMockServer wireMockServer = new WireMockServer(
                wireMockConfig().port(port)
                        .extensions(new ResponseTransformer() {
                            @Override
                            public Response transform(Request request, Response response, FileSource files, Parameters parameters) {

                                return Response.Builder.like(response)
                                        .body(
                                                response
                                                        .getBodyAsString()
                                                        .replace("weather","mockjava weather"))
                                        .build();
                            }

                            @Override
                            public String getName() {
                                return "ResponseTransformerdemo";
                            }
                        })

        );
        wireMockServer.start();

        configureFor(port);



        //业务逻辑
        stubFor(get(urlMatching(".*"))
                .willReturn(aResponse().proxiedFrom("https://restapi.amap.com"))

        );


        sleep(99999);
        WireMock.reset();
        wireMockServer.stop();
    }
}
