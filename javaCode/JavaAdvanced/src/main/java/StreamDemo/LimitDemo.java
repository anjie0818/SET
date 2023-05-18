/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package StreamDemo;
import java.util.*;
import java.util.stream.*;

public class LimitDemo {

    public static void main(String[] args) {
        // 获取Stream对象
        Stream<String> hogwarts = Stream.of("Hogwarts", "霍格沃兹");

        // limit()：截取
        List<String> result = hogwarts.limit(1)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
