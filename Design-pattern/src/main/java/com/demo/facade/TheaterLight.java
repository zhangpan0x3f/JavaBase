package com.demo.facade;

/**
 * @author 张攀
 * @date 2021/2/17 19:13
 * 描述：
 */
public class TheaterLight {

    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(" TheaterLight on ");
    }

    public void off(){
        System.out.println(" TheaterLight off ");
    }

    public void dim(){
        System.out.println(" TheaterLight dim ");
    }

    public void bright(){
        System.out.println(" TheaterLight bright ");
    }

}
