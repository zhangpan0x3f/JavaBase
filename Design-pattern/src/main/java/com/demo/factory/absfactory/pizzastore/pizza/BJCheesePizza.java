package com.demo.factory.absfactory.pizzastore.pizza;

/**
 * @author 张攀
 * @date 2021/2/10 17:09
 * 描述：
 */
public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京奶酪披萨pizza");
        System.out.println("北京的奶酪披萨准备原材料");
    }
}
