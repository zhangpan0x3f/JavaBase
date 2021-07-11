package com.demo.decorator;

/**
 * @author 张攀
 * @date 2021/2/16 19:06
 * 描述：
 */
public class Chocolate extends Decorator{

    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力");
        setPrice(3.0f);
    }
}
