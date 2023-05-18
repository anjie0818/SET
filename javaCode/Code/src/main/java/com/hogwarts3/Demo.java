/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */
package com.hogwarts3;


public class Demo {
    public static void main(String[] args) {
        // 向上转型
        Person people = new Worker();
        // 向下转型
        Worker people2 = (Worker) people;
        people2.work();
        // 向下转型反例
//        Student people3 = (Student) people;
//        people3.study();
        // 判断 people 实例是否为Student
        System.out.println(people instanceof Student);
        // 如果是 Student 才调用Student的方法
        if (people instanceof Student){
                Student people3 = (Student) people;
                people3.study();
        }

    }
}
//    父类 实例对象 = new 子类();
//    子类 people2 = (子类) 实例对象;