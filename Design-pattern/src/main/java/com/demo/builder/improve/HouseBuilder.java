package com.demo.builder.improve;

/**
 * @author 张攀
 * @date 2021/2/12 21:03
 * 描述：
 */
//抽象的建造者
public abstract class HouseBuilder {

    protected House house = new House();

    //将建造的流程写好
    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    //建造房子
    public House buildHouse(){
        return house;
    }

}
