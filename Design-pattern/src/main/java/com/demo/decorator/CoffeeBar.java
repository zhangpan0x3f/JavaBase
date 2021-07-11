package com.demo.decorator;

import java.io.BufferedInputStream;

/**
 * @author 张攀
 * @date 2021/2/16 19:38
 * 描述：
 */
public class CoffeeBar {

    public static void main(String[] args) {

        //1.点一份LongBlack
        Drink order = new LongBlack();
        System.out.println("费用1=" + order.cost());
        System.out.println("描述=" + order.getDes());

        //2.加入一份牛奶
        order = new Milk(order);
        System.out.println("费用2=" + order.cost());
        System.out.println("描述=" + order.getDes());

        order = new Chocolate(order);
        System.out.println("费用3=" + order.cost());
        System.out.println("描述=" + order.getDes());


    }

}
