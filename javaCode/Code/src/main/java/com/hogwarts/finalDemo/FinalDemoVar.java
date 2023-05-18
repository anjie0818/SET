/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */
package com.hogwarts.finalDemo;

public class FinalDemoVar {
    public static void main(String[] args) {
        Hogwarts Harry = new Hogwarts("哈利");
        System.out.println("Harry1"+Harry);
        Harry = new Hogwarts("哈利");
        // Harry的内存地址改变
        System.out.println("Harry2"+Harry);
        final Hogwarts Hermione = new Hogwarts("赫敏");
        //错误写法，因为已经使用final修饰 Hermione
//        Hermione = new Hogwarts("赫敏");
//         引用类型的地址不可以改变，但是其中的属性可以改变
        System.out.println(Hermione.getName());
        Hermione.setName("赫敏小可爱");
        System.out.println(Hermione.getName());
    }
}
