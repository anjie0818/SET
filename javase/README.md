## 可变参数
> 在JDK1.5之后，如果我们定义一个方法需要接受多个参数，并且多个参数类型一致，我们可以对其简化.
* 1.一个方法只能有一个可变参数
* 2.如果方法中有多个参数，可变参数要放到最后
## Collection集合
* Collection：是单列集合类的根接口 
### java.util.List: List的特点是元素有序、元素可重复 
  * ArrayList集合: 实现类,查询快,增删慢
  * LinkedList集合: 实现类,查询慢,增删快
### java.util.Set: Set的特点是元素不可重复(唯一)
  * HashSet集合: 实现类,元素存取无序
  * LinkedHashSet集合:实现类,元素存取有序
  * TreeSet集合:实现类,可以对集合中的元素进行排序 
  * 注意:
    * 1.Set集合没有特殊的方法,都是使用Collection接口的方法 
    * 2.Set集合没有索引,所以遍历元素的方式就只有: 增强for循环,或者迭代器
## Map集合
* 1.Map集合存储元素是以键值对的形式存储,每一个键值对都有键和值
* 2.Map集合的键是唯一,值可以重复,如果键重复了,那么值就会被覆盖
* 3.根据键取值
### Map集合子类:
* HashMap<K,V>：存储数据采用的哈希表结构，元素的存取顺序不能保证一致。
                    由于要保证键的唯一、不重复，需要重写键的hashCode()方法、equals()方法。

* LinkedHashMap<K,V>：HashMap下有个子类LinkedHashMap，存储数据采用的哈希表结构+链表结构。
               通过链表结构可以保证键值对的存取顺序一致；
               通过哈希表结构可以保证的键的唯一、不重复，需要重写键的hashCode()方法、equals()方法。

* TreeMap<K,V>：TreeMap集合和Map相比没有特有的功能，底层的数据结构是红黑树；
                可以对元素的键进行排序，排序方式有两种:自然排序和比较器排序
### Map接口中定义了很多方法，常用的如下：
```
public V put(K key, V value): 把指定的键与指定的值添加到Map集合中。
public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
public boolean containsKey(Object key):判断该集合中是否有此键
public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中。
public Set<Map.Entry<K,V>> entrySet(): 获取到Map集合中所有的键值对对象的集合(Set集合)。
```
## 异常
* Throwable
  * Error:严重错误Error，无法通过处理的错误，只能事先避免
  * Exception:表示异常，异常产生后程序员可以通过代码的方式纠正，使程序继续运行，是必须要处理的
    * 编译时期异常:checked异常。在编译时期,就会检查,如果没有处理异常,则编译失败。(如日期格式化异常)
    * 运行时期异常:runtime异常。在运行时期,检查异常.在编译时期,运行异常不会编译器检测(不报错)。(如数学异常)
![](./images/error图谱.png)
### 产生异常
```
throw new ParseException("解析异常",1);
```
### 抛出异常
```
public static void method1() throws ParseException{
        // 产生一个异常对象
        throw new ParseException("解析异常",1);
}
```
### 捕获异常
```
try{
     编写可能会出现异常的代码
}catch(异常类型  e){
     处理异常的代码
     //记录日志/打印异常信息
}
执行步骤:
	1.首先执行try中的代码,如果try中的代码出现了异常,那么就直接执行catch()里面的代码,执行完后,程序继续往下执行
    2.如果try中的代码没有出现异常,那么就不会执行catch()里面的代码,而是继续往下执行
```
### 扩展--finally经典面试题
```java

/**
 * @Author：pengzhilin
 * @Date: 2020/9/16 15:22
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(method1());// 30
        System.out.println(method2());// 20
    }

    public static int method1() {
        int num = 10;
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            num = 20;
            return num;
        } finally {
            num = 30;
            return num;
        }
    }

    public static int method2() {
        int num = 10;
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            num = 20;
            // catch中的return会做2件事:1.先记录要返回的值,然后执行finally中的代码,2.最后把记录的值返回
            return num;// 记录要返回的值:20
        } finally {
            num = 30;
        }
        return num;
    }
}
```
## 多线程
### 知识点--并发与并行
* 并行：指两个或多个事件在同一时刻发生（同时执行）。
* 并发：指两个或多个事件在同一个时间段内发生(交替执行)。
### 知识点-- 线程与进程
* 进程：有独立的内存空间，进程中的数据存放空间（堆空间和栈空间）是独立的，至少有一个线程。
* 线程：堆空间是共享的，栈空间是独立的，线程消耗的资源比进程小的多。
### 创建线程的方式
* 继承
* 实现
* 匿名内部类   
[code](./src/main/java/org/study/线程创建/Test1.java)
## Lambda表达式
### 知识点-- 函数式编程思想概述
* 面向对象编程思想
  * 面向对象强调的是对象 , “必须通过对象的形式来做事情”，相对来讲比较复杂,有时候我们只是为了做某件事情而不得不创建一个对象 , 例如线程执行任务,我们不得不创建一个实现Runnable接口对象
* 函数编程思想
  * 而函数式思想则尽量忽略面向对象的复杂语法——*强调做什么，而不是以什么形式做*。例如线程执行任务 , 使用函数式思想 , 我们就可以通过*传递一段代码给线程对象执行*,而不需要创建任务对象
### Lambda方式创建线程执行任务
```java
public class Demo {
    public static void main(String[] args) {
  		// 体验Lambda表达式的方式:
        Thread t3 = new Thread(()->{System.out.println("Lambda表达式的方式");});
        t3.start();
    }
}
```
### Lambda表达式总结
```
Lambda表达式的标准格式:
                Lambda表达式的作用: 就是简化代码，省略了面向对象中类和方法,对象的书写。
                Lambda表达式的标准格式:
                    (参数类型 参数名,参数类型 参数名,...) -> { 代码语句 }
                Lambda表达式的格式说明:
                    1.小括号中的参数要和接口中抽象方法的形参列表一致,无参数则留空；多个参数则用逗号分隔。
                    2.->是新引入的语法格式，代表指向动作。可以理解为把小括号中的参数传递给大括号中使用
                    3.大括号中的内容其实就是存放以前重写抽象方法的方法体
                Lambda表达式的使用条件: 接口中有且仅有一个抽象方法的接口,才可以使用Lambda表达式
                    1.接口中只有一个抽象方法的接口,叫做函数式接口
                    2.如果是函数式接口,那么就可以使用@FunctionalInterface注解来标识

                使用Lambda表达式:
                    1.判断接口是否是函数式接口
                    2.如果是函数式接口,那么就直接写()->{}
                    3.然后填充小括号和大括号中的内容
```
### Lambda省略
* 在Lambda标准格式的基础上，使用省略写法的规则为：
  * 小括号内参数的类型可以省略；
  * 如果小括号内有且仅有一个参数，则小括号可以省略；
  * 如果大括号内有且仅有一条语句，则无论是否有返回值，都可以省略大括号、return关键字及语句分号。
```java
package com.itheima.demo6_Lambda表达式省略格式;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/19 12:19
 */
@FunctionalInterface
interface A {
    void method(int num);
}

public class Test {

    public static void show(A a) {
        a.method(10);
    }

    public static void main(String[] args) {
        /*
            Lambda表达式省略格式:
                1.小括号中的形参类型可以省略
                2.如果小括号中只有一个参数,那么小括号也可以省略
                3.如果大括号中只有一条语句,那么大括号,分号,return可以一起省略
         */
        // 案例1:创建线程执行任务
        new Thread(() ->
                System.out.println("任务代码")
        ).start();

        // 案例2: 对ArrayList集合元素进行排序
        ArrayList<Integer> names = new ArrayList<>();
        names.add(300);
        names.add(200);
        names.add(100);
        names.add(500);
        names.add(400);
        System.out.println("排序前:" + names);

        // 对集合中的元素按照降序排序

        // 函数式编程:Lambda表达式
        Collections.sort(names, (i1, i2) -> i2 - i1);

        System.out.println("排序后:" + names);

        System.out.println("=======================================");
        // Lambda标准格式
        show((int num) -> {
            System.out.println(num);
        });

        // Lambda省略格式
        show(num ->
                System.out.println(num)
        );
    }
}
```
## Stream
### 传统方式操作集合 vs Stream流操作集合
[code](./src/main/java/org/study/stream流/Test1.java)
### Map、Collection、Array获取流
[code](./src/main/java/org/study/stream流/Test2.java)

