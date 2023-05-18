/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package RandomDemo;
import java.util.Random;

public class RandomValues {
    public static void main(String[] args) {
        // 实例化Random对象
        Random r = new Random();
        // 生成随机整数
        System.out.println(r.nextInt());
        System.out.println("0~99: " + r.nextInt(100));

        // 生成随机小数
        System.out.println("double: " + r.nextDouble());
        System.out.println("float: " + r.nextFloat());

        // 生成随机布尔值
        System.out.println("boolean: " + r.nextBoolean());
    }
}
