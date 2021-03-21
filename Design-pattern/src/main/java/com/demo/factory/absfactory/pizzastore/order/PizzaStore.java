package com.demo.factory.absfactory.pizzastore.order;

/**
 * @author 张攀
 * @date 2021/2/10 21:59
 * 描述：
 */
public class PizzaStore {

    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }

}
