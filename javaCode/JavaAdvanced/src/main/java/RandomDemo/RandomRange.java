/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package RandomDemo;
import java.util.PrimitiveIterator;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomRange {
    public static void main(String[] args) {
        // 实例化Random对象
        Random r = new Random();

        // 通过迭代器的方式获取随机数
        IntStream ins = r.ints(90, 100);
        PrimitiveIterator.OfInt it = ins.iterator();
        Integer num = it.next();
        // 打印随机数
        System.out.println(num);

    }
}
