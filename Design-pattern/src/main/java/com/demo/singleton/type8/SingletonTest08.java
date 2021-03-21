package com.demo.singleton.type8;

/**
 * @author 张攀
 * @date 2021/2/8 15:23
 * 描述：枚举方式
 */
public class SingletonTest08 {

    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode() = " + instance.hashCode());
        System.out.println("instance2.hashCode() = " + instance.hashCode());
    }

}

enum Singleton{

    INSTANCE;  //属性

    public void sayOk(){
        System.out.println("ok");
    }

}