/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package FileDemo;
import java.io.File;

public class FileConstructor {
    public static void main(String[] args) {
        // 1、通过文件路径名
        File macFile = new File("/Users/Hogwarts/Docs");
        File winFile = new File("D:\\hogwarts\\Docs\\demo.txt");

        // 2、通过父路径+子路径字符串
        File myFile = new File("d:\\hogwarts", "demo.txt");

        // 3、通过父对象+子路径字符串
        File parentFile = new File("d:\\hogwarts");
        File childFile = new File(parentFile, "demo.txt");
    }
}
