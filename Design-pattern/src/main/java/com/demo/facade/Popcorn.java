package com.demo.facade;

/**
 * @author 张攀
 * @date 2021/2/17 17:57
 * 描述：
 */
public class Popcorn {

    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(" popcorn on ");
    }

    public void off(){
        System.out.println(" popcorn off ");
    }

    public void pop(){
        System.out.println(" popcorn is poping ");
    }

}
