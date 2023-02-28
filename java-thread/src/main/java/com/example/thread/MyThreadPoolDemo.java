package com.example.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPoolDemo {

    public static void main(String[] args) {
        //查看主机线程核心数
        System.out.println(Runtime.getRuntime().availableProcessors());

        //创建5个线程的池子 eg:执行长期任务，性能好很多
//        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        //创建1个线程的池子 eg:一个任务一个任务执行的场景
//        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        //创建可扩展线程的池子 eg:执行很多短期异步小程序 或者 负载较轻的服务器
        ExecutorService threadPool = Executors.newCachedThreadPool();
        //20个用户办理业务，5个营业员
        try {
            for (int i = 1; i <= 20; i++) {
                threadPool.execute(()->{
                    System.out.println(Thread.currentThread().getName()+ "\t办理业务");
                });
            }
        }catch (Exception e){

        }finally {
            threadPool.shutdown();
        }
    }
}
