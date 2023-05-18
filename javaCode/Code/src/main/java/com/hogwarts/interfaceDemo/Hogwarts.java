package com.hogwarts.interfaceDemo;
public interface Hogwarts {
    // 抽象方法，分院
    public void sortingCeremony();
    // 如果传入lambda，就会报错
//    public void sortingCeremony2();
    // 默认方法，坐火车，每个子类都一样
    public default void byTrain(){
        System.out.println("坐火车去学校");
    }
}