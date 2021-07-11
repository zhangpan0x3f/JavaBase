package com.demo.factory.simplefactory.pizzastore.pizza;

/**
 * @author 张攀
 * @date 2021/2/8 19:10
 * 描述：
 */
public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(" 给胡椒披萨准备原材料");
    }
}
