package com.demo.factory;

import java.util.Calendar;

/**
 * @author 张攀
 * @date 2021/2/11 12:28
 * 描述：
 */
public class Factory {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
    }

}
