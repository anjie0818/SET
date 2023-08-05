package org.study.可变参数;


/**
 * @Author：pengzhilin
 * @Date: 2020/9/15 9:55
 */
public class Test {
    public static void main(String[] args) {
        /*
            可变注意事项:
                    1.一个方法,只能有一个可变参数
                    2.如果方法有多个参数,可变参数一定要放在末尾
         */
        // method1(10,20,"itheima");
        // method2(10,20,"itheima");
        method3("itheima",10,20);
    }

    // 编译报错,因为一个方法,只能有一个可变参数
    /*public static void method1(int... nums,String... strs){

    }*/

    // 编译报错,因为如果方法有多个参数,可变参数一定要放在末尾
    /*public static void method2(int... nums,String  str){

    }*/

    public static void method3(String str,int... nums){

        System.out.println("-->str:"+str);
        System.out.println("-->nums:"+nums);

        for (int num : nums) {
            System.out.println(num);
        }
    }
}