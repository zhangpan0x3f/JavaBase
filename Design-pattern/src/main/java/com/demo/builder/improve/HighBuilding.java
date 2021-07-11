package com.demo.builder.improve;

/**
 * @author 张攀
 * @date 2021/2/12 21:11
 * 描述：
 */
public class HighBuilding extends HouseBuilder{

    @Override
    public void buildBasic() {
        System.out.println("高楼打地基100米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙20cm");
    }

    @Override
    public void roofed() {
        System.out.println("高楼的透明屋顶");
    }
}
