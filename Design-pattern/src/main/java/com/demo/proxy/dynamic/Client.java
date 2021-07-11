package com.demo.proxy.dynamic;

import com.demo.proxy.staticproxy.TeacherDaoProxy;

/**
 * @author zhang pan
 * @date 2021/4/20 4:01 下午
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象（被代理对象）
        ITeacherDao target = new TeacherDao();
        //创建被代理对象,同时将被代理对象传递给代理对象
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        //通过代理对象，调用到被代理对象到方法
        System.out.println(proxyInstance.getClass());
        proxyInstance.teach();
    }
}
