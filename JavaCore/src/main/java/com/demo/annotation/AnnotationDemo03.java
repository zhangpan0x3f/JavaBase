package com.demo.annotation;

import java.lang.annotation.*;

/**
 * @author : zhang pan
 * @date : 3:38 下午 2021/6/9
 * 描述：
 */
//标记这些注解是否包含在用户文档中。
@Documented
//标记这个注解是继承于哪个注解类(默认注解并没有继承于任何子类)。
@Inherited
//标识这个注解怎么保存，是只在代码中，还是编入class文件中，或者是在运行时可以通过反射访问。
@Retention(RetentionPolicy.SOURCE)//SOURCE，CLASS，RUNTIME
//所修饰的对象范围
@Target(ElementType.TYPE)//TYPE，FIELD，METHOD，PARAMETER，CONSTRUCTOR，LOCAL_VARIABLE，ANNOTATION_TYPE，PACKAGE，TYPE_PARAMETER，TYPE_USE
public @interface AnnotationDemo03 {

    //使用 @Native 注解修饰成员变量，则表示这个变量可以被本地代码引用，常常被代码生成工具使用。
    @Native
    String value = "@Native";

}
