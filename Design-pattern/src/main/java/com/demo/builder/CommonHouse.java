package com.demo.builder;

/**
 * @author 张攀
 * @date 2021/2/12 19:09
 * 描述：
 */
public class CommonHouse extends AbstractHouse{

    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }
}
