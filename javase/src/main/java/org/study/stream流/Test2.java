package org.study.stream流;

import java.util.*;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        /*
            根据集合来获取:
                 根据Collection获取流:
                    Collection<E>接口中有一个stream()方法,可以获取流 , default Stream<E> stream()
                        1.根据List获取流
                        2.根据Set获取流

                 根据Map获取流:
                      1.根据Map集合的键获取流
                      2.根据Map集合的值获取流
                      3.根据Map集合的键值对对象获取流

            根据数组获取流
                Stream<T>接口中有一个方法,可以获取流, public static <T> Stream<T> of(T... values)
         */
        // 创建List集合
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张杰");
        list.add("张三丰");
        Stream<String> stream1 = list.stream();

        // 创建Set集合
        Set<String> set = new HashSet<>();
        set.add("张无忌");
        set.add("周芷若");
        set.add("赵敏");
        set.add("张杰");
        set.add("张三丰");
        Stream<String> stream2 = set.stream();

        // 创建Map集合
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "java");
        map.put(2, "php");
        map.put(3, "c");
        map.put(4, "c++");
        map.put(5, "Python");

        // 1.根据Map集合的键获取流
        Set<Integer> keys = map.keySet();
        Stream<Integer> stream3 = keys.stream();

        // 2.根据Map集合的值获取流
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();

        // 3.根据Map集合的键值对对象获取流
        Set<Map.Entry<Integer, String>> entrys = map.entrySet();
        Stream<Map.Entry<Integer, String>> stream5 = entrys.stream();

        // 根据数组获取流
        String[] arr = {"张无忌",
                "周芷若",
                "赵敏",
                "张杰",
                "张三丰"};
        Stream<String> stream6 = Stream.of(arr);

        // 直接获取流
        Stream<String> stream7 = Stream.of("张三", "李四", "王五");
    }
}

