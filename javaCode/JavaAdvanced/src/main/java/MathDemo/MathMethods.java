/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package MathDemo;
// 导入Math类
import java.lang.Math;

public class MathMethods {
    public static void main(String[] args) {
        // abs()：绝对值
        int abs = Math.abs(-8);
        System.out.println("abs(-8): " + abs);

        // ceil()：向上取整
        double ceil = Math.ceil(3.4);
        System.out.println("ceil(3.4): " + ceil);

        // floor()：向下取整
        double floor = Math.floor(5.9);
        System.out.println("floor(5.9): " + floor);

        // round()：四舍五入
        long roundD = Math.round(6.6);
        System.out.println("round(6.6): " + roundD);

        int roundF = Math.round(6.3f);
        System.out.println("round(6.3f): " + roundF);

        // min()：最小值
        System.out.println("min(7, 10): " + Math.min(7, 10));
        System.out.println("min(3.2, 5.9): " + Math.min(3.2, 5.9));
        // max()：最大值
        System.out.println("max(7, 10): " + Math.max(7, 10));
        System.out.println("max(3.2, 5.9): " + Math.max(3.2, 5.9));

        // sqrt()：求平方根
        double sqrt = Math.sqrt(16.0);
        System.out.println("sqrt(16.0): " + sqrt);

        // pow()：求幂
        double pow = Math.pow(2.0, 3.0);
        System.out.println("pow(2.0, 3.0): " + pow);
    }
}
