package com.demo.add;

import sun.awt.windows.ThemeReader;

import java.util.concurrent.CountDownLatch;

/**
 * @author zhang pan
 * @Description 类描述
 */
//计数器
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        //总数是6
        CountDownLatch countDownLatch = new CountDownLatch(6);
        // 总数是6，必须要执行任务的时候，再使用！
        for (int i = 0; i < 6; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName() + " go out ");
                countDownLatch.countDown();  //数量-1
            },String.valueOf(i)).start();
        }
        countDownLatch.await(); // 等待计数器归零，然后再向下执行
        System.out.println("Close Door");
    }
}
