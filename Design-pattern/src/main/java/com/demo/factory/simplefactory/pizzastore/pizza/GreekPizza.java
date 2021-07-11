package com.demo.factory.simplefactory.pizzastore.pizza;

/**
 * @author 张攀
 * @date 2021/2/8 17:01
 * 描述：
 */
public class GreekPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println(" 给希腊披萨准备原材料 ");
    }
}
