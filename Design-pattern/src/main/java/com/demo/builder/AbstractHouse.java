package com.demo.builder;

/**
 * @author 张攀
 * @date 2021/2/12 18:23
 * 描述：
 */
public abstract class AbstractHouse {

    //打地基
    public abstract void buildBasic();

    //砌墙
    public abstract void buildWalls();

    //封顶
    public abstract void roofed();

    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }

}
