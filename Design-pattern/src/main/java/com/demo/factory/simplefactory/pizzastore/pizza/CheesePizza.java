package com.demo.factory.simplefactory.pizzastore.pizza;

/**
 * @author 张攀
 * @date 2021/2/8 16:58
 * 描述：
 */
public class CheesePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println(" 给奶酪披萨准备原材料 ");
    }

}
