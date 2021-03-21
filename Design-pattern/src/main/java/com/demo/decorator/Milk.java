package com.demo.decorator;

/**
 * @author 张攀
 * @date 2021/2/16 19:18
 * 描述：
 */
public class Milk extends Decorator{

    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(2.0f);
    }
}
