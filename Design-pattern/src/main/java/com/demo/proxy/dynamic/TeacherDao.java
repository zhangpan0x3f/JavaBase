package com.demo.proxy.dynamic;

/**
 * @author zhang pan
 * @date 2021/4/20 3:42 下午
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println(" 老师正在授课中.... ");
    }
}
