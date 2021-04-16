package com.demo.pc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhang pan
 * @Description 交替打印A1B2C3D4...
 */
public class CharAndNumber {
    public static void main(String[] args) {
        Task task = new Task();
        new Thread(()->{
            for(int i = 0;i < 26;i++){
                try {
                    task.printChar();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"A").start();
        new Thread(()->{
            for(int i = 0;i < 26;i++){
                try {
                    task.printNumber();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"B").start();
    }
}

class Task{

    char c = 'A';
    int number = 1;

    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void printChar() throws InterruptedException {
        lock.lock();
        try {
            while(c - 'A' == number){
                condition.await();
            }
            System.out.print(c);
            c = (char)(c + 1);
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void printNumber() throws InterruptedException {
        lock.lock();
        try {
            while(c - 'A' != number){
                condition.await();
            }
            System.out.print(number);
            number++;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
