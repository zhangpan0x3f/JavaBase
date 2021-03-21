package com.demo.adapter.objectadapter;

/**
 * @author 张攀
 * @date 2021/2/13 12:38
 * 描述：
 */
public class Phone {

    public void charging(Voltage5V v){
        if(v.output5V() == 5){
            System.out.println("电压为5v,可以充电~~");
        }else if(v.output5V() > 5){
            System.out.println("电压过高,不能充电");
        }
    }

}
