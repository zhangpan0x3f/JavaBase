package com.demo.decorator;

import java.util.ArrayList;

/**
 * @author 张攀
 * @date 2021/2/16 14:54
 * 描述：
 */
public abstract class Drink {

    /**描述**/
    private String des;

    /**价格**/
    private float price = 0.0f;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * 计算费用的抽象方法
     * 子类来实现
     * @return void
     */
    public abstract float cost();

}
