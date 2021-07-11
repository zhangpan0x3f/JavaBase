package com.demo.bq;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * @author : zhang pan
 * @date : 11:15 上午 2021/6/4
 * 描述：BlockingDeque：支持阻塞的双端队列(双端队列的入队和出队操作在两端都可进行)
 */
public class BlockingDequeDemo {

    public static void main(String[] args) throws InterruptedException {
        test6();
    }

    public static void test1(){
        //队列的大小
        BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>(3);

        //Throws exception：Deque full、NoSuchElementException
        //从队首添加
        blockingDeque.addFirst(1);
        blockingDeque.addFirst(1);
        blockingDeque.addFirst(1);
//        blockingDeque.addFirst(1);
        //从队首移除
        blockingDeque.removeFirst();
        blockingDeque.removeFirst();
//        blockingDeque.removeFirst();
//        blockingDeque.removeFirst();
        //从队首获取第一个元素
        Integer first = blockingDeque.getFirst();
        System.out.println(first);
    }

    public static void test2(){
        BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>(3);

        //return Special value：true or false
        //从队首添加
        boolean is1 = blockingDeque.offerFirst(1);
        boolean is2 = blockingDeque.offerFirst(1);
        boolean is3 = blockingDeque.offerFirst(1);
        boolean is4 = blockingDeque.offerFirst(1);
        System.out.println(is1 + " " + is2 + " " + is3 + " " + is4);
        //从队首移除
        Integer e1 = blockingDeque.pollFirst();
        Integer e2 = blockingDeque.pollFirst();
        Integer e3 = blockingDeque.pollFirst();
        Integer e4 = blockingDeque.pollFirst();
        System.out.println(e1 + " " + e2 + " " + e3 + " " + e4);
        blockingDeque.offerFirst(1);
        //得到队首的第一个元素
        Integer integer = blockingDeque.peekFirst();
        System.out.println(integer);
    }

    public static void test3() throws InterruptedException {
        BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>(3);

        //Blocks：一直阻塞
        //从队首添加
        blockingDeque.putFirst(1);
        blockingDeque.putFirst(1);
        blockingDeque.putFirst(1);
        System.out.println(blockingDeque);
//        blockingDeque.putFirst(1);
        //从队首移除
        blockingDeque.takeFirst();
        blockingDeque.takeFirst();
        blockingDeque.takeFirst();
//        blockingDeque.takeFirst();
        System.out.println(blockingDeque);
    }

    public static void test4() throws InterruptedException {
        BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>(3);

        //从队首添加，队列满，blocks for only a given maximum time limit before giving up
        //boolean offerFirst(E e, long timeout, TimeUnit unit)
        blockingDeque.offerFirst(1,5, TimeUnit.SECONDS);
        blockingDeque.offerFirst(1,5, TimeUnit.SECONDS);
        blockingDeque.offerFirst(1,5, TimeUnit.SECONDS);
        blockingDeque.offerFirst(1,5, TimeUnit.SECONDS);

        //从队首移除，队列空，blocks for only a given maximum time limit before giving up
        blockingDeque.pollFirst(5,TimeUnit.SECONDS);
        blockingDeque.pollFirst(5,TimeUnit.SECONDS);
        blockingDeque.pollFirst(5,TimeUnit.SECONDS);
        blockingDeque.pollFirst(5,TimeUnit.SECONDS);

        System.out.println(blockingDeque);
    }

    public static void test5(){
        BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>(3);

        //Throws exception：Deque full、NoSuchElementException
        //从队尾添加
        blockingDeque.addLast(1);
        blockingDeque.addLast(2);
        blockingDeque.addLast(3);
//        blockingDeque.addLast(4);

        //从队尾移除
        blockingDeque.removeLast();
        blockingDeque.removeLast();
//        blockingDeque.removeLast();
//        blockingDeque.removeLast();

        //从队尾获取第一个元素
        Integer last = blockingDeque.getLast();
        System.out.println(last);
    }

    public static void test6(){
        BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>(3);

        //return Special value：true or false
        //从队尾添加
        boolean is1 = blockingDeque.offerLast(1);
        boolean is2 = blockingDeque.offerLast(2);
        boolean is3 = blockingDeque.offerLast(3);
        boolean is4 = blockingDeque.offerLast(4);
        System.out.println(is1 + " " + is2 + " " + is3 + " " + is4);

        //从队尾移除
        Integer e1 = blockingDeque.pollLast();
        Integer e2 = blockingDeque.pollLast();
        Integer e3 = blockingDeque.pollLast();
        Integer e4 = blockingDeque.pollLast();
        System.out.println(e1 + " " + e2 + " " + e3 + " " + e4);
        blockingDeque.offerLast(1);
        //得到队尾的第一个元素
        Integer integer = blockingDeque.peekLast();
        System.out.println(integer);
    }

}
