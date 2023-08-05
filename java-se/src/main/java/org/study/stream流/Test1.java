package org.study.stream流;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    /**
     * 例如: 有一个List集合,要求:
     *
     *    将List集合中姓张的的元素过滤到一个新的集合中
     *    然后将过滤出来的姓张的元素,再过滤出长度为3的元素,存储到一个新的集合中
     * @param args
     */
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("张无忌");
        names.add("周芷若");
        names.add("赵敏");
        names.add("张杰");
        names.add("张三丰");

        //传统方式
        List<String> list2 = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("张")){
                list2.add(name);
            };
        }
        List<String> list3 = new ArrayList<>();
        for (String s : list2) {
            if (s.length() == 3){
                list3.add(s);
            }
        }
        System.out.println(list3);
        // 流
        names.stream().filter(e->e.startsWith("张")).filter(e->e.length()==3).forEach(e-> System.out.println(e));
        System.out.println(names);//Stream对原list没影响
    }


}
