/**
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 * 对于成员变量来说，如果使用final 关键字修饰，
 * 那么这个变量也照样是不可变的
 * 1. 成员变量具有默认值，所以用了final 之后必须手动赋值，不会再给自动赋值了
 * 2. 对于final 的成员变量，要么使用直接赋值，要么通过构造方法赋值
 * 3. 必须保证类中的所有重载的构造方法，都最终会给final 的成员变量进行复制
 */
package com.hogwarts.finalDemo;

public class finalDemo4 {
}
