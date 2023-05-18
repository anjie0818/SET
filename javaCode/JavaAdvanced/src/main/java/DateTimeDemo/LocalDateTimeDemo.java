/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package DateTimeDemo;
import java.time.LocalDateTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        // now()：返回当前系统时间的对象
        LocalDateTime tmNow = LocalDateTime.now();
        System.out.println("now(): " + tmNow);

        // of()：自定义日期时间对象
        LocalDateTime tmOf = LocalDateTime.of(2022, 2, 14, 21, 30, 30);
        System.out.println("of(): " + tmOf);

        // getXxx：获取相关属性
        System.out.println("当月第几天：" + tmNow.getDayOfMonth());
        System.out.println("本周第几天：" + tmNow.getDayOfWeek());
        System.out.println("月份的名称：" + tmNow.getMonth());
        System.out.println("月份的数值：" + tmNow.getMonthValue());
        System.out.println("分钟数值：" + tmNow.getMinute());
        System.out.println("--------------");

        // withXxx：设置相关的属性
        System.out.println("withDayOfMonth: " + tmNow.withDayOfMonth(20));
        System.out.println("withHour: " + tmNow.withHour(23));
        System.out.println("now(): " + tmNow);
        System.out.println("--------------");

        // plusXxx：属性增加
        System.out.println("plusMonths: " + tmNow.plusMonths(3));

        // minusXxx：属性减少
        System.out.println("minusDays: " + tmNow.minusDays(3));

    }
}
