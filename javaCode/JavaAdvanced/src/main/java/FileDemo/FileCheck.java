/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package FileDemo;
import java.io.File;

public class FileCheck {
    public static void main(String[] args) {
        // 实例化文件对象
        File baseDir = new File("./src/main/resources");
        File myFile = new File(baseDir, "/hogwarts.txt");

        // 判断文件是否存在
        System.out.println(myFile.exists());

        // 判断是否是目录
        System.out.println(myFile.isDirectory());

        // 判断是否是文件
        System.out.println(myFile.isFile());
    }
}
