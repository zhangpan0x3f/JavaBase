package com.demo.adapter.interfaceadapter;

/**
 * @author 张攀
 * @date 2021/2/14 18:14
 * 描述：
 */
public class Client {

    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void m1() {
                System.out.println("hello world");
            }
        };
        absAdapter.m1();
    }

}
