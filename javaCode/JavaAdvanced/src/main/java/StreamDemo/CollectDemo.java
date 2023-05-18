/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package StreamDemo;
import java.util.*;
import java.util.stream.*;

public class CollectDemo {
    public static void main(String[] args) {
        // 获取流对象
        Stream<String> hogwarts = Stream.of("Hogwarts", "霍格沃兹");

        // collect()：收集
        Set<String> mySet = hogwarts.filter(s -> s.startsWith("H"))
                .collect(Collectors.toSet());
        System.out.println(mySet);
    }
}
