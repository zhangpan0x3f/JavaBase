package com.demo.bridge;

/**
 * @author 张攀
 * @date 2021/2/15 17:21
 * 描述：
 */
public class Client {

    public static void main(String[] args) {
        Phone phone1 = new FoldedPhone(new XiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();

        System.out.println("*******************");

        Phone phone2 = new UpRightPhone(new Vivo());
        phone2.open();
        phone2.call();
        phone2.close();

    }

}
