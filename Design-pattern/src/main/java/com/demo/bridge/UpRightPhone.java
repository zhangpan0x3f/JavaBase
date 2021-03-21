package com.demo.bridge;

/**
 * @author 张攀
 * @date 2021/2/15 18:01
 * 描述：
 */
public class UpRightPhone extends Phone{

    public UpRightPhone(Brand brand) {
        super(brand);
    }


    @Override
    protected void open() {
        super.open();
        System.out.println("直立样式的手机");
    }


    @Override
    protected void close() {
        super.close();
        System.out.println("直立样式的手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("直立样式的手机");
    }

}
