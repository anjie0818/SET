package org.study.basics;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class WeWorkAuthTest {

    private static FirefoxDriver driver;
    private ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

    @BeforeAll
    static void initDriver(){
        driver = new FirefoxDriver();
        driver.get("https://work.weixin.qq.com/wework_admin/frame#index");

    }
    @Test
    void saveCookies() throws IOException, InterruptedException {
        //打开浏览器后网址可能会有跳转，获取最新的url地址
        String url = driver.getCurrentUrl();
        //扫码过程
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
        //一旦扫码完成，url会跳转，跳转后自动停止等待并执行后续的操作
        wait.until(webDriver -> !webDriver.getCurrentUrl().equals(url));

        //扫码完成后保存cookies，因为cookies里有服务器存储的sessionid
        Set<Cookie> cookies = driver.manage().getCookies();
        mapper.writeValue(new File("cookies.yaml"), cookies);

    }
    @Test
    void loadCookies() throws IOException {
        TypeReference<List<HashMap<String,Object>>> typeReference = new TypeReference<>() {
        };
        List<HashMap<String, Object>> cookies = mapper.readValue(new File("cookies.yaml"), typeReference);

        cookies.stream().filter(cookie -> cookie.get("domain").toString().contains("work.weixin.qq.com"))
                .forEach(cookie -> {
                    //写cookie到浏览器
                    driver.manage().addCookie(
                            new Cookie(cookie.get("name").toString(), cookie.get("value").toString()));
                });
        driver.navigate().refresh();
    }
}
