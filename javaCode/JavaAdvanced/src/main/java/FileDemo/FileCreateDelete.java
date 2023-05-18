/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package FileDemo;
import java.io.File;
import java.io.IOException;

public class FileCreateDelete {
    public static void main(String[] args) throws IOException {

        // 实例化File文件对象
        File newFile = new File("./newFile.txt");

        // 创建文件
        boolean result1 = newFile.createNewFile();
        System.out.println("创建文件：" + result1);

        // 创建目录 mkdir()
        File hogwarts = new File("./hogwarts");
        boolean result2 = hogwarts.mkdir();
        System.out.println("创建目录：" + result2);

        // 创建多级目录 mkdirs()
        File abc = new File("./a/b/c");
        boolean result3 = abc.mkdirs();
        System.out.println("创建多级目录：" + result3);

        // 删除文件 delete()
        boolean result4 = newFile.delete();
        System.out.println("删除文件：" + result4);

        // 删除空目录 delete()
        boolean result5 = hogwarts.delete();
        System.out.println("删除空目录：" + result5);

        // 删除非空目录
        File demo = new File("./demo");
        boolean result6 = demo.delete();
        System.out.println("删除非空目录：" + result6);

    }
}
