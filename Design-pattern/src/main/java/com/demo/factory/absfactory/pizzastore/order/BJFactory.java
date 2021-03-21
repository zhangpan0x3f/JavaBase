package com.demo.factory.absfactory.pizzastore.order;

import com.demo.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.demo.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.demo.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @author 张攀
 * @date 2021/2/10 21:36
 * 描述：
 */
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
