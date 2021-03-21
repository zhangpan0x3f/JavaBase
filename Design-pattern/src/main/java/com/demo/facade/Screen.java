package com.demo.facade;

/**
 * @author 张攀
 * @date 2021/2/17 18:49
 * 描述：
 */
public class Screen {

    private static Screen instance = new Screen();

    public static Screen getInstance(){
        return instance;
    }

    public void up(){
        System.out.println(" Screen up ");
    }

    public void down(){
        System.out.println(" Screen down ");
    }

    public void focus(){
        System.out.println(" Projector is Projector ");
    }

}
