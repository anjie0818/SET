/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package StreamDemo;
// 导入依赖
import java.util.*;
import java.util.stream.*;

public class FilterDemo {
    public static void main(String[] args) {
        // 获取Stream对象
        Stream<String> hogwarts = Stream.of("Hogwarts", "霍格沃兹");

        // filter()：过滤
        List<String> result = hogwarts.filter( s-> s.startsWith("H"))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
