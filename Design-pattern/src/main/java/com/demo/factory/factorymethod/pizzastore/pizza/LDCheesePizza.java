package com.demo.factory.factorymethod.pizzastore.pizza;

/**
 * @author 张攀
 * @date 2021/2/10 17:09
 * 描述：
 */
public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦奶酪披萨pizza");
        System.out.println("伦敦的奶酪披萨准备原材料");
    }
}
