package com.demo.pc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhang pan
 * @Description 类描述
 */
public class B {
    public static void main(String[] args) {
        Data1 data1 = new Data1();
        new Thread(()->{
            for(int i = 0;i < 10;i++){
                try {
                    data1.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"A").start();
        new Thread(()->{
            for(int i = 0;i < 10;i++){
                try {
                    data1.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"B").start();
        new Thread(()->{
            for(int i = 0;i < 10;i++){
                try {
                    data1.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"C").start();
        new Thread(()->{
            for(int i = 0;i < 10;i++){
                try {
                    data1.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"D").start();
    }
}

//等待，业务，通知
class Data1{//数字     资源类

    private int  number = 0;

    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();  //精准的通知和唤醒线程
    //+1
    public void increment() throws InterruptedException {
        lock.lock();
        try {
            while(number != 0){
                condition.await();  //等待
            }
            number++;           //唤醒全部
            System.out.println(Thread.currentThread().getName() +  "=>" + number);
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    //-1
    public void decrement() throws InterruptedException {
        lock.lock();
        try {
            while(number == 0){
                condition.await();  //等待
            }
            number--;           //唤醒全部
            System.out.println(Thread.currentThread().getName() +  "=>" + number);
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
