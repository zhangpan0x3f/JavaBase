package com.demo.singleton.type2;

/**
 * @author 张攀
 * @date 2021/2/8 13:32
 * 描述：
 */
public class SingletonTest02 {

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

    //2.本类内部创建对象实例
    private static Singleton instance;

    //在静态代码块钟，创建单例对象
    static{
        instance = new Singleton();
    }

    //3.提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }

}