package com.demo.proxy.staticproxy;

/**
 * @author zhang pan
 * @date 2021/4/20 3:16 下午
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师授课中.....");
    }
}
