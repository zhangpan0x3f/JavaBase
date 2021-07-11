package com.demo.factory.absfactory.pizzastore.order;

import com.demo.factory.absfactory.pizzastore.pizza.*;

/**
 * @author 张攀
 * @date 2021/2/10 21:49
 * 描述：
 */
public class LDFactory implements AbsFactory{

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }

}
