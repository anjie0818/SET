package org.study.basics;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class WeworkLogin {
    public  FirefoxDriver driver;
    public WebDriverWait wait;

    private ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

    public WeworkLogin(){
        driver = new FirefoxDriver();
        driver.get("https://work.weixin.qq.com/wework_admin/frame#index");
        wait = new WebDriverWait(driver, Duration.ofSeconds(20), Duration.ofSeconds(2));

    }

    void loadCookies()  {
        TypeReference<List<HashMap<String,Object>>> typeReference = new TypeReference<>() {
        };
        List<HashMap<String, Object>> cookies = null;
        try {
            cookies = mapper.readValue(new File("cookies.yaml"), typeReference);
        } catch (IOException e) {
            e.printStackTrace();
        }

        cookies.stream().filter(cookie -> cookie.get("domain").toString().contains("work.weixin.qq.com"))
                .forEach(cookie -> {
                    //写cookie到浏览器
                    driver.manage().addCookie(
                            new Cookie(cookie.get("name").toString(), cookie.get("value").toString()));
                });
        driver.navigate().refresh();
    }
    public void close(){
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

}

