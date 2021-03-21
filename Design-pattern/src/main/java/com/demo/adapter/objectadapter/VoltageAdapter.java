package com.demo.adapter.objectadapter;

/**
 * @author 张攀
 * @date 2021/2/13 12:36
 * 描述：适配器类
 */
public class VoltageAdapter implements Voltage5V {

    private Voltage220V voltage220V; //聚合

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if(voltage220V != null){
            int src = voltage220V.output220V();
            System.out.println("使用对象适配器，进行适配~~");
            dst = src / 44;
            System.out.println("适配完成，输出的电压为=" + dst);
        }
        return dst;
    }
}
