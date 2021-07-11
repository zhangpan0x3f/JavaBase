package com.demo.decorator;

/**
 * @author 张攀
 * @date 2021/2/16 19:26
 * 描述：
 */
public class Soy extends Decorator{

    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆");
        setPrice(1.5f);
    }
}
