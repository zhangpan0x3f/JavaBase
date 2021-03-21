package com.demo.singleton.type3;

/**
 * @author 张攀
 * @date 2021/2/8 13:36
 * 描述：懒汉式(线程不安全)
 */
public class SingletonTest03 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode() = " + instance.hashCode());
        System.out.println("instance2.hashCode() = " + instance.hashCode());
    }

}

class Singleton{

    private static Singleton instance;

    //1.构造器私有化,外部不能new
    private Singleton() {
    }

    //提供一个静态的公有方法，当使用到该方法时，才去创建instance
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}