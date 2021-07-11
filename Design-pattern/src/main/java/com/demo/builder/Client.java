package com.demo.builder;

/**
 * @author 张攀
 * @date 2021/2/12 19:20
 * 描述：
 */
public class Client {

    public static void main(String[] args) {
        AbstractHouse abstractHouse = new CommonHouse();
        abstractHouse.build();
    }

}
