package com.demo.factory.factorymethod.pizzastore.pizza;

/**
 * @author 张攀
 * @date 2021/2/8 16:34
 * 描述：
 */
public abstract class Pizza {

    private String name;  //名字

    //准备原材料
    public abstract void prepare();

    public void bake(){
        System.out.println(name + " baking;");
    }

    public void cut(){
        System.out.println(name + " cutting;");
    }

    public void box(){
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
