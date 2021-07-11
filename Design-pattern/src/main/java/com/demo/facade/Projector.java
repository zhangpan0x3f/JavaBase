package com.demo.facade;

/**
 * @author 张攀
 * @date 2021/2/17 18:32
 * 描述：
 */
public class Projector {

    private static Projector instance = new Projector();

    public static Projector getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(" Projector on ");
    }

    public void off(){
        System.out.println(" Projector off ");
    }

    public void focus(){
        System.out.println(" Projector is Projector ");
    }

}
