/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package RandomDemo;

import java.util.Random;

public class RandomConstructor {

    public static void main(String[] args) {
        // 实例化Random对象
        Random r1 = new Random();
        System.out.println(r1.nextInt());

        // 实例化Random对象（有参构造）
        Random r2 = new Random(666);
        Random r3 = new Random(666);

        System.out.println(r2.nextInt());
        System.out.println(r2.nextInt());
        System.out.println("-----------");
        System.out.println(r3.nextInt());
        System.out.println(r3.nextInt());
    }
}
