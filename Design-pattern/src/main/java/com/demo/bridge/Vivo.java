package com.demo.bridge;

/**
 * @author 张攀
 * @date 2021/2/15 16:32
 * 描述：
 */
public class Vivo implements Brand{

    @Override
    public void open() {
        System.out.println("vivo手机开机");
    }

    @Override
    public void close() {
        System.out.println("vivo手机关机");
    }

    @Override
    public void call() {
        System.out.println("vivo手机打电话");
    }

}
