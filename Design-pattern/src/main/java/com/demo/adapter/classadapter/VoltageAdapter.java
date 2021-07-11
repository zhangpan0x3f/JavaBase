package com.demo.adapter.classadapter;

/**
 * @author 张攀
 * @date 2021/2/13 12:36
 * 描述：适配器类
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V{

    @Override
    public int output5V() {
        int srcV = output220V();
        int desV = srcV / 44;  //转成5V
        return desV;
    }
}
