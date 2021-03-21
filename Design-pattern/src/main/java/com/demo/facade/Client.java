package com.demo.facade;

/**
 * @author 张攀
 * @date 2021/2/17 19:19
 * 描述：
 */
public class Client {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
        homeTheaterFacade.end();
    }

}
