package com.demo.builder.improve;

/**
 * @author 张攀
 * @date 2021/2/12 21:15
 * 描述：
 */
public class Client {

    public static void main(String[] args) {
        HouseDirector houseDirector = new HouseDirector(new HighBuilding());
        houseDirector.constructHouse();
        StringBuilder sb = new StringBuilder();
    }

}
