package com.demo.factory.factorymethod.pizzastore.pizza;

/**
 * @author 张攀
 * @date 2021/2/10 17:36
 * 描述：
 */
public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦胡椒披萨pizza");
        System.out.println("伦敦的胡椒披萨准备原材料");
    }
}
