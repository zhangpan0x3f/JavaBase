package com.demo.factory.simplefactory.pizzastore.order;

import com.demo.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 张攀
 * @date 2021/2/8 17:02
 * 描述：
 */
public class OrderPizza2 {

    Pizza pizza = null;
    String orderType = "";

    public OrderPizza2() {
        do{
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);
            //输出pizza信息
            if(pizza != null){  //订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
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
