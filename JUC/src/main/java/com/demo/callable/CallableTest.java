package com.demo.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author zhang pan
 * @Description 类描述
 */
/**
 * 1、探究原理
 * 2、觉自己会用
 */
public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // new Thread(new Runnable()).start();
        // new Thread(new FutureTask<V>()).start();
        // new Thread(new FutureTask<V>( Callable )).start();
        new Thread().start();   // 怎么启动Callable
        MyThread1 myThread1 = new MyThread1();
        FutureTask<Integer> futureTask = new FutureTask<>(myThread1); // 适配类
        new Thread(futureTask,"A").start();
        new Thread(futureTask,"B").start(); // 结果会被缓存，效率高

        Integer o = (Integer) futureTask.get(); //这个get 方法可能会产生阻塞！把他放到最后
        // 或者使用异步通信来处理！
        System.out.println(o);
    }
}

class MyThread implements Runnable{
    @Override
    public void run() {

    }
}

class MyThread1 implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        System.out.println("call()");   // 会打印几个call
        // 耗时的操作
        return 1024;
    }
}