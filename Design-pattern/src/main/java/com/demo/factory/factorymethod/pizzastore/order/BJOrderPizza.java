package com.demo.factory.factorymethod.pizzastore.order;

import com.demo.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.demo.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @author 张攀
 * @date 2021/2/10 20:23
 * 描述：
 */
public class BJOrderPizza extends OrderPizza{

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJCheesePizza();
        }
        return pizza;
    }
}
