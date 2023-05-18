package demo;

/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */

public enum  HogwartsUnit {

    Harry("Harry", 18),
    AD("AD", 20),
    AD2("AD2", 22);
    private final String name;
    private final Integer age;
    private HogwartsUnit(String name, Integer age){
        this.name = name;
        this.age = age;
    }
}