/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package DateTimeDemo;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class InstantDemo {
    public static void main(String[] args) {
        // now()
        Instant now = Instant.now();
        System.out.println("当前时间：" + now);

        // 添加时间偏移
        OffsetDateTime odt = now.atOffset(ZoneOffset.ofHours(8));
        System.out.println("偏移时间：" + odt);

        // toEpochMilli()：获取时间戳
        long l = now.toEpochMilli();
        System.out.println("毫秒数：" + l);

        // ofEpochMilli()：通过毫秒数，返回Instant实例
        Instant instant = Instant.ofEpochMilli(1644848570049L);
        System.out.println(instant);

    }
}
