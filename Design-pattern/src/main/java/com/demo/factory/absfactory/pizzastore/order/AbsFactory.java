package com.demo.factory.absfactory.pizzastore.order;

import com.demo.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @author 张攀
 * @date 2021/2/10 21:34
 * 描述：
 */
//一个抽象工厂模式的抽象层(接口)
public interface AbsFactory {

    //让下面的工厂子类来具体实现
    public Pizza createPizza(String orderType);

}
