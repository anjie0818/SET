package org.study.线程创建;

import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        //继承
//        ExtendThread thread1 = new ExtendThread();
//        thread1.start();
        //实现
//        Thread thread2 = new Thread(new ImpRunnable());
//        thread2.start();
        //匿名内部类
//        Thread thread3 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("子线程"+i+"次");
//                }
//            }
//        });
//        thread3.start();
        // 拉姆达表达式
        Thread thread4 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("子线程"+i+"次");
                }
        });
        thread4.start();

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("主线程"+i+"次");
        }
    }
}
class ImpRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程"+i+"次");
        }
    }
}
class ExtendThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程"+i+"次");
        }
    }
}
