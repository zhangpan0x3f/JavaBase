package com.demo.decorator;

/**
 * @author 张攀
 * @date 2021/2/16 18:48
 * 描述：
 */
public class Decorator extends Drink{

    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        //自己价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        return super.getDes() + " " + super.getPrice() + " && " + obj.getDes();
    }
}
