package com.demo.pc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhang pan
 * @Description 类描述
 */
public class SynchronizedCharAndNumber {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        new Thread(()->{
            for(int i = 0;i < 26;i++){
                try {
                    task1.printChar();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"A").start();
        new Thread(()->{
            for(int i = 0;i < 26;i++){
                try {
                    task1.printNumber();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"B").start();
    }
}

class Task1{

    char c = 'A';
    int number = 1;

    public synchronized void printChar() throws InterruptedException {
            while(c - 'A' == number){
                this.wait();
            }
            System.out.print(c);
            c = (char)(c + 1);
            this.notifyAll();
    }

    public synchronized void printNumber() throws InterruptedException {
            while(c - 'A' != number){
                this.wait();
            }
            System.out.print(number);
            number++;
            this.notifyAll();
    }

}
