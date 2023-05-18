/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package DateTimeDemo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class FormatterDemo {
    public static void main(String[] args) {
        // 实例化对象
        String fmt = "yyyy-MM-dd HH:mm:ss";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(fmt);

        // 将日期时间对象==》字符串
        String timeStr = formatter.format(LocalDateTime.now());
        System.out.println(timeStr);

        // 日期时间字符串==》日期时间对象
        TemporalAccessor acc = formatter.parse("2022-02-14 22:30:00");
        System.out.println(acc);

    }
}
