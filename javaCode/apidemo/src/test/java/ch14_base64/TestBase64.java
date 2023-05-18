/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package ch14_base64;
import org.apache.commons.codec.binary.Base64;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

public class TestBase64 {

    @Test
    void testBase64(){

        // 加密明文：hogwarts
        // 获取字节数字
        byte[] arr = "hogwarts".getBytes(StandardCharsets.UTF_8);
        String encodeMsg = Base64.encodeBase64String(arr);
        System.out.println(encodeMsg);

        // 解密密文：aG9nd2FydHM=
        byte[] arr2 = Base64.decodeBase64("aG9nd2FydHM=");
        String decodeMsg = new String(arr2, StandardCharsets.UTF_8);
        System.out.println(decodeMsg);

    }


}
