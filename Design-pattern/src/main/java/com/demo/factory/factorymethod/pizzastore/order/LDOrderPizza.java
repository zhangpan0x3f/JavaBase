package com.demo.factory.factorymethod.pizzastore.order;

import com.demo.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import com.demo.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @author 张攀
 * @date 2021/2/10 20:39
 * 描述：
 */
public class LDOrderPizza extends OrderPizza{

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new LDCheesePizza();
        }
        return pizza;
    }
}
