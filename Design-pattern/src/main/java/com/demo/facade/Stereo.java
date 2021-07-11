package com.demo.facade;

/**
 * @author 张攀
 * @date 2021/2/17 19:10
 * 描述：
 */
public class Stereo {

    private static Stereo instance = new Stereo();

    public static Stereo getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(" Stereo up ");
    }

    public void off(){
        System.out.println(" Stereo down ");
    }

    public void up(){
        System.out.println(" voice up ");
    }

}
