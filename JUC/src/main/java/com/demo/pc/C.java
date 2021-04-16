package com.demo.pc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhang pan
 * @Description 类描述
 */
public class C {

    public static void main(String[] args) {
        Data3 data3 = new Data3();
        new Thread(()->{for(int i = 0;i < 10;i++){data3.printA();}},"A").start();
        new Thread(()->{for(int i = 0;i < 10;i++){data3.printB();}},"B").start();
        new Thread(()->{for(int i = 0;i < 10;i++){data3.printC();}},"C").start();
    }

}

class Data3{

    char c = 'A';

    private Lock lock = new ReentrantLock();
    Condition condition1 = lock.newCondition();
    Condition condition2 = lock.newCondition();
    Condition condition3 = lock.newCondition();
    private int number = 1;  //number为1时让A执行

    public void printA(){
        lock.lock();
        try {
            while(number != 1){
                condition1.await();
            }
            System.out.println(Thread.currentThread().getName() + "=>AAAAAA");
            //业务，判断->执行->通知
            number++;
            condition2.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void printB(){
        lock.lock();
        try {
            while(number != 2){
                condition2.await();
            }
            System.out.println(Thread.currentThread().getName() + "=>BBBBBB");
            //业务，判断->执行->通知
            number++;
            condition3.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void printC(){
        lock.lock();
        try {
            while(number != 3){
                condition3.await();
            }
            System.out.println(Thread.currentThread().getName() + "=>CCCCCC");
            //业务，判断->执行->通知
            number = 1;
            condition1.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
