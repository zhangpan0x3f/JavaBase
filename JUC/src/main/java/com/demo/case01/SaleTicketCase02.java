package com.demo.case01;

/**
 * @author zhang pan
 * @Description 卖票
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程就是一个单独的资源类，没有任何附属的操作
 * 1.属性、方法
 */
public class SaleTicketCase02 {

    public static void main(String[] args) {
        Ticket1 ticket1 = new Ticket1();
        new Thread(()->{
            for(int i = 0;i < 50;i++){
                ticket1.sale();}
        },"A")
                .start();
        new Thread(()->{
            for(int i = 0;i < 50;i++){
                ticket1.sale();}
        },"B")
                .start();
        new Thread(()->{
            for(int i = 0;i < 50;i++){
                ticket1.sale();}
        },"C")
                .start();
    }

}

/***
 * Synchronized 和 Lock 区别
 * 1、Synchronized 内置的Java关键字， Lock 是一个Java类
 * 2、Synchronized 无法判断获取锁的状态，Lock 可以判断是否获取到了锁
 * 3、Synchronized 会自动释放锁，lock 必须要手动释放锁！如果不释放锁，死锁
 * 4、Synchronized 线程 1（获得锁，阻塞）、线程2（等待，傻傻的等）；Lock锁就不一定会等待下去；
 * 5、Synchronized 可重入锁，不可以中断的，非公平；Lock ，可重入锁，可以 判断锁，非公平（可以自己设置）；
 * 6、Synchronized 适合锁少量的代码同步问题，Lock 适合锁大量的同步代码！
 */

/**三部曲
 * 1.new ReentrantLock();
 * 2.lock.lock();   加锁
 * 3.finally => lock.unlock(); 解锁
*/
class Ticket1{

    //属性、方法
    private int number = 50;

    Lock lock = new ReentrantLock();

    //卖票的方式
    //synchronized 本质：队列 锁
    public void sale(){
        //加锁
        lock.lock();
        try {
            //业务代码
            if(number > 0){
                System.out.println(Thread.currentThread().getName() + "卖出了" + number-- + "票，剩余：" + number);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //解锁
            lock.unlock();
        }
    }

}