package com.demo.factory.simplefactory.pizzastore.pizza;

/**
 * @author 张攀
 * @date 2021/2/9 13:20
 * 描述：
 */
public class ChinaPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("给中国披萨准备原材料");
    }
}
