package com.demo.case01;

import java.util.concurrent.locks.LockSupport;

/**
 * @author zhang pan
 * @Description 类描述
 */
public class Test1 {
    public static void main(String[] args) {
        /*
         * 获取cpu的核数
         * CPU密集型，IO密集型
         * 并发编程的本质：充分利用cpu的资源
         **/
        System.out.println(Runtime.getRuntime().availableProcessors());

        /*线程的状态：
         * NEW              新建
         * RUNNABLE         运行
         * BLOCKED          阻塞
         * WAITING          等待
         * TIMED_WAITING,   超时等待
         * TERMINATED       终止
         */

        /**
         * wait和sleep的区别
         * 1.来自不同的类
         * wait -> Object
         * sleep -> Thread
         *
         * 2.关于锁的释放
         * wait会释放锁，sleep睡觉了，抱着锁睡,不会释放锁
         *
         * 3.使用的范围是不同的
         * wait 必须在同步代码块中
         *sleep 可以在任何地方睡
         *
         * 4.是否需要捕获异常
         * wait不需要捕获异常
         * sleep必须要捕获异常
         */

        /**
         * lock锁(重点)
         */

    }
}
