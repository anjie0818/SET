/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package StreamDemo;

// 导入依赖
import java.util.*;
import java.util.stream.Stream;

public class SteamMethod {

    public static void main(String[] args) {
        // Collection 接口
        Stream<Integer> listS = new ArrayList<Integer>().stream();
        Stream<Integer> setS = new HashSet<Integer>().stream();
        Stream<Integer> vectorS = new Vector<Integer>().stream();

        // Map 接口
        HashMap<String, String> map = new HashMap<>();
        // key
        Stream<String> keys = map.keySet().stream();
        // value
        Stream<String> values = map.values().stream();
        // k-v
        Stream<Map.Entry<String, String>> entryStream = map.entrySet().stream();

    }
}
