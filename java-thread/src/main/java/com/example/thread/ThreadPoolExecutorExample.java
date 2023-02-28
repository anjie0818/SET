package com.example.thread;

import java.util.concurrent.*;

public class ThreadPoolExecutorExample {
    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(2,
                5,
                100L,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(3), //等候区
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        try {

            for (int i = 1; i <= 11; i++) {
                int finalI = i;
                executorService.execute(()->{
                    System.out.println(Thread.currentThread().getName() +"\t 办理业务 人员-"+ finalI);
                    try {
                        TimeUnit.SECONDS.sleep(4);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            executorService.shutdown();
        }
    }
}
