/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package FileDemo;
import java.io.File;

public class FileInfo {
    public static void main(String[] args) {

        /*
        实例化File对象(绝对路径)
         */
        File absFile = new File("/Users/Hogwarts.txt");
        //File absFile = new File("D:\\Users\\Hogwarts.txt");

        // 获取绝对路径
        System.out.println(absFile.getAbsolutePath());
        // 获取路径
        System.out.println(absFile.getPath());
        // 获取文件的名字
        System.out.println(absFile.getName());
        // 获取文件的长度
        System.out.println(absFile.length());

        System.out.println("-------------------");

        /*
        实例化File对象（相对路径）
         */
        File relFile = new File("rel.txt");
        // 获取完整路径
        System.out.println(relFile.getAbsolutePath());
        // 获取路径
        System.out.println(relFile.getPath());
        // 获取文件名称
        System.out.println(relFile.getName());
        // 获取文件大小
        System.out.println(relFile.length());

    }
}
