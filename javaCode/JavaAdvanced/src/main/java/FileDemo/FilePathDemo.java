/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package FileDemo;
import java.io.File;

public class FilePathDemo {
    public static void main(String[] args) {
        // 绝对路径（从根目录开始）
        File absFile = new File("/Users/Hogwarts/demo.txt");

        // 相对路径
        File relFile = new File("./here.txt");
    }
}
