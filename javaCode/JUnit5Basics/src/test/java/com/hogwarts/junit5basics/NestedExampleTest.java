package com.hogwarts.junit5basics;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedExampleTest {
    // 使用@Nested 注解的场景
    // @Nested 需要结合class 使用
    // @Nested 里面需要与测试用例结合
    @Nested
    class AuthorityManage{
        @Nested
        class Manager{
            @Test
            void addUser(){
                System.out.println("新增用户");
            }
            @Test
            void delUser(){
                System.out.println("新增用户");
            }
        }
        @Test
        void employeeManage(){
            System.out.println("员工管理");
        }
    }
    @Nested
    class UserManage{
        @Test
        void userManage(){
            System.out.println("用户管理");
        }
    }



    // 如果不使用@Nested注解
//    @Test
//    void authorityManage(){
//        System.out.println("权限管理");
//    }
//    @Test
//    void userManage(){
//        System.out.println("用户管理");
//    }
//    @Test
//    void managerManage(){
//        System.out.println("管理员管理");
//    }
//    @Test
//    void employeeManage(){
//        System.out.println("员工管理");
//    }
}
