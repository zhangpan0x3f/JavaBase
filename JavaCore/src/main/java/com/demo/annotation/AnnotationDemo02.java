package com.demo.annotation;

/**
 * @author : zhang pan
 * @date : 5:49 下午 2021/6/7
 * 描述：
 */
//告诉编译器检查这个接口，保证该接口只能包含一个抽象方法，否则就会编译出错。
@FunctionalInterface
public interface AnnotationDemo02 {

    /**
     * 两数相乘
     * @param a
     * @param b
     */
    void mul(int a,int b);

    /**
     * 默认方法
     */
    default void show(){
        System.out.println("hello world");
    }

    /**
     *静态方法
     */
    static void print(){
        System.out.println("java");
    }

}
