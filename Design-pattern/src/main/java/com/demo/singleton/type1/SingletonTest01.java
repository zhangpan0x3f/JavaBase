package com.demo.singleton.type1;

/**
 * @author 张攀
 * @date 2021/2/8 13:02
 * 描述：饿汉式(静态变量)
 *
 */
public class SingletonTest01 {

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
    private final static Singleton instance = new Singleton();

    //3.提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }

}