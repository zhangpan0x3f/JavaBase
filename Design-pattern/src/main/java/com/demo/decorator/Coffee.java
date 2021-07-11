package com.demo.decorator;

/**
 * @author 张攀
 * @date 2021/2/16 17:08
 * 描述：
 */
public class Coffee extends Drink{

    @Override
    public float cost() {
        return super.getPrice();
    }
}
