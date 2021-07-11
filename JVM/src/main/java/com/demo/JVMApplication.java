package com.demo;

import java.util.Random;

/**
 * @author : zhang pan
 * @date : 1:57 下午 2021/6/28
 * 描述：
 */
public class JVMApplication {

    public static void main(String[] args) {
        char[] name = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Random random = new Random();
        while (true){
            for(int i = 0;i < random.nextInt(10);i++){
                System.out.print(name[random.nextInt(26)]);
            }
            System.out.println();
        }
    }

}
