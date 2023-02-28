package com.example.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class MyThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("main线程-id:"+Thread.currentThread().getId());
        //方法一：继承Thread
        Thread thread1 = new Thread01();
        thread1.start();
        //方法二：实现runnable接口
        Thread thread2 = new Thread(new Thread02());
        thread2.start();
        //方法三：实现Callable接口+FutureTask（可以拿到返回结果，可以处理异常）
        FutureTask<String> futureTask = new FutureTask<>(new Thread03());
        Thread thread3 = new Thread(futureTask);
        thread3.start();
        System.out.println(futureTask.get());
    }
    public static class Thread01 extends Thread{
        @Override
        public void run()  {
            System.out.println("currentThread-id:"+Thread.currentThread().getId());
        }
    }
    public static class Thread02 implements Runnable{

        @Override
        public void run() {
            System.out.println("currentThread-id:"+Thread.currentThread().getId());
        }
    }
    public static class Thread03 implements Callable<String> {


        @Override
        public String call() throws Exception {
            String log = "currentThread-id:"+Thread.currentThread().getId();
            System.out.println(log);
            return log;
        }
    }
}
