package com.demo.bridge;

/**
 * @author 张攀
 * @date 2021/2/15 16:33
 * 描述：
 */
public abstract class Phone {

    //组合品牌
    private Brand brand;

    //构造器
    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open(){
        this.brand.open();
    }


    protected void close(){
        this.brand.close();
    }

    protected void call(){
        this.brand.call();
    }

}
