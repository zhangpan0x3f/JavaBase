package com.demo.singleton.type7;

/**
 * @author 张攀
 * @date 2021/2/8 13:55
 * 描述：静态内部类
 */
public class SingletonTest07 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode() = " + instance.hashCode());
        System.out.println("instance2.hashCode() = " + instance.hashCode());
    }

}

class Singleton{

    //1.构造器私有化,外部不能new
    private Singleton() {
    }

    //写一个静态内部类，该类中有一个静态属性
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    //提供一个静态的公有方法
    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}