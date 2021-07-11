package com.demo.annotation;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author : zhang pan
 * @date : 5:15 下午 2021/6/7
 * 描述：
 */
public class AnnotationDemo implements Annotation {

    /**
     * 检查该方法是否是重写方法。如果发现其父类，或者是引用的接口中并没有该方法时，会报编译错误。
     * @return null
     */
    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }

    /**
     * 标记过时方法。如果使用该方法，会报编译警告。
     * @param a
     * @param b
     * @return int数值
     */
    @Deprecated
    public int add(int a,int b){
        return a + b;
    }

    /**
     * 指示编译器去忽略注解中声明的警告。
     * @param a
     * @param b
     */
    @SuppressWarnings({"unchecked"})
    public void use(int a,int b){
        System.out.println(add(a,b));
    }

    public static void main(String[] args) {
        @SuppressWarnings({"unused"})
        int a = 1;
        AnnotationDemo annotationDemo = new AnnotationDemo();
        //annotationDemo.add(1,2);
        annotationDemo.use(1,2);
    }

    //忽略任何使用参数为泛型变量的方法或构造函数调用产生的警告。
    @SafeVarargs // Not actually safe!
    static void m(List<String>... stringLists) {
        Object[] array = stringLists;
        List<Integer> tmpList = Arrays.asList(42);
        array[0] = tmpList; // Semantically invalid, but compiles without warnings
        String s = stringLists[0].get(0); // Oh no, ClassCastException at runtime!
    }

}
