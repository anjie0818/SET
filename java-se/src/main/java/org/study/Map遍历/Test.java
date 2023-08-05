package org.study.Map遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        // 创建Map集合对象,限制键的类型为String,值的类型为String
        Map<String, String> map = new HashMap<>();
        // 往map集合中添加键值对
        map.put("黄晓明", "杨颖");
        map.put("文章", "马伊琍");
        map.put("谢霆锋", "王菲");

        // 方法一：keySet()
        Set<String> ks = map.keySet();
        for (String k : ks) {
            System.out.println(k+"-"+map.get(k));
        }
        // 方法二：entrySet()
        Set<Map.Entry<String, String>> es = map.entrySet();
        for (Map.Entry<String, String> e : es) {
            System.out.println(e.getKey()+"-"+e.getValue());
        }
    }
}
