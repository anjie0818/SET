package com.selenium.mukePageObject.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * @创建人 anjie
 * @创建时间 2019/2/19
 * @描述
 */
public class ProUtil {
    private String url;

    public ProUtil(String url) {
        this.url = url;
    }
    public String  getPro(String key) throws IOException {
        Properties properties = new Properties();
        // 使用ClassLoader加载properties配置文件生成对应的输入流
        System.out.println();
        InputStream in = this.getClass().getClassLoader().getResourceAsStream(url);
        // 使用properties对象加载输入流
        properties.load(new InputStreamReader(in, "utf-8"));
        return properties.getProperty(key);
    }
    public void writePro(String key,String value){
        Properties pro = new Properties();
        try {
            FileOutputStream file = new FileOutputStream(url);
            pro.setProperty(key, value);
            pro.store(file, key);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
