/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package StreamDemo;
// 导入Stream 接口
import java.util.stream.Stream;

public class OfMethod {

    public static void main(String[] args) {
        // of() 方法
        Stream<Integer> num = Stream.of(1, 2, 3);

        // 接收数组
        String[] words = {"Java", "Python", "Go"};
        Stream<String> wordsStream = Stream.of(words);
    }
}
