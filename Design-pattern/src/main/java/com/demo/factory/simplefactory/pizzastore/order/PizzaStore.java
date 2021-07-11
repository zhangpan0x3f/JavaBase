package com.demo.factory.simplefactory.pizzastore.order;

/**
 * @author 张攀
 * @date 2021/2/8 17:16
 * 描述：
 */
//相当于一个客户端，发出订购
public class PizzaStore {

    public static void main(String[] args) {
//        OrderPizza orderPizza = new OrderPizza(new SimpleFactory());
        OrderPizza2 orderPizza2 = new OrderPizza2();
        System.out.println("~程序退出~");

    }

}
