/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package FileDemo;
import java.io.File;

public class FileTraversal {
    public static void main(String[] args) {
        // 获取当前目录的文件对象
        File currentDir = new File(".");

        // 获取文件名称数组 list()
        String[] names = currentDir.list();
        // 遍历
        for(String name: names){
            // 打印名字
            System.out.println(name);
        }

        System.out.println("------------");

        // 获取文件对象数组 listFiles()
        File[] files = currentDir.listFiles();
        for(File file: files){
            System.out.println(file.getName() + ": " + file.length());
        }
    }

}
