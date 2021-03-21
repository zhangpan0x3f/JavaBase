package com.demo.prototype;

/**
 * @author 张攀
 * @date 2021/2/11 17:02
 * 描述：
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("tom", 1, "白色");
        Object clone = sheep.clone();
        System.out.println(clone);
        System.out.println(sheep == clone);
    }

}
