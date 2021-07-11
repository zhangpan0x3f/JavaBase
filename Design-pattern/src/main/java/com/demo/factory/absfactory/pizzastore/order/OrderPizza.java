package com.demo.factory.absfactory.pizzastore.order;

import com.demo.factory.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 张攀
 * @date 2021/2/10 21:51
 * 描述：
 */
public class OrderPizza {

    AbsFactory factory;

    public OrderPizza(AbsFactory factory) {
        setAbsfactory(factory);
    }

    public void setAbsfactory(AbsFactory factory) {
        Pizza pizza = null;
        String orderType = ""; //用户输入
        this.factory = factory;
        do{
            orderType = getType();
            pizza = factory.createPizza(orderType);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购失败");
                break;
            }
        }while(true);
    }

    //写一个方法，可以获取客户希望订购的披萨种类
    private String getType(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return " ";
        }
    }
}
