package com.demo.bridge;

/**
 * @author 张攀
 * @date 2021/2/15 16:30
 * 描述：
 */
public class XiaoMi implements Brand{

    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}
