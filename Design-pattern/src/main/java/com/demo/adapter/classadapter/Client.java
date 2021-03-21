package com.demo.adapter.classadapter;

/**
 * @author 张攀
 * @date 2021/2/13 12:39
 * 描述：
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("=====类适配器模式======");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }

}
