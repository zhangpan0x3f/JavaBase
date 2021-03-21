package com.demo.factory.simplefactory.pizzastore.order;

import com.demo.factory.simplefactory.pizzastore.pizza.*;

/**
 * @author 张攀
 * @date 2021/2/9 11:39
 * 描述：简单工厂类
 */

public class SimpleFactory {

    //根据orderType返回对应的pizza对象
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if(orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }else if(orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }else if(orderType.equals("china")){
            pizza = new ChinaPizza();
            pizza.setName("中国披萨");
        }
        return pizza;
    }

    //根据orderType返回对应的pizza对象
    public static Pizza createPizza2(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if(orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }else if(orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }else if(orderType.equals("china")){
            pizza = new ChinaPizza();
            pizza.setName("中国披萨");
        }
        return pizza;
    }

}
