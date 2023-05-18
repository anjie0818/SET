package com.hogwarts.interfaceDemo5;

public interface Animal {
    // 私有方法，静态方法不可以调用
    private String getName(){
        return "Animal";
    };
    // 私有静态方法，默认方法和静态方法都可以调用
    private static void getColor(){
        System.out.println("私有静态方法getColor");
    }
    public default void defaultMethod(){
        getColor();
        String name = getName();
    }
    public static void staticMethod(){
        getColor();
        //静态方法不能调用私有方法
//        String name = getName();
    }
}
