/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package ScannerDemo;
import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {
        // 实例化Scanner对象
        Scanner hogwarts = new Scanner(System.in);

        // next()方法
        System.out.print("请输入一段文本：");
        String msg = hogwarts.next();
        System.out.println("输入的数据为：" + msg);

        // nextInt()方法
        System.out.print("请输入一个数字：");
        int num = hogwarts.nextInt();
        System.out.println("用户输入的数字为：" + num);

        // hasNextXXX() 方法
        if(hogwarts.hasNextInt()){
            System.out.println("太棒了，果然还有数字");
        }else{
            System.out.println("不是数字，程序结束");
        }

    }
}
