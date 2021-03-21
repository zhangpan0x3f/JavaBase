package com.demo.prototype.deepclone;

/**
 * @author 张攀
 * @date 2021/2/12 16:02
 * 描述：
 */
public class Client {

    public static void main(String[] args) {
        DeepPrototype deepPrototype = new DeepPrototype();
        deepPrototype.name = "宋江";
        deepPrototype.deepCloneTarget = new DeepCloneableTarget("大牛","大牛的类");
    }

}
