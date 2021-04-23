package com.demo.proxy.staticproxy;

/**
 * @author zhang pan
 * @date 2021/4/20 3:17 下午
 */
public class TeacherDaoProxy implements ITeacherDao{

    /**
     * 目标对象，通过接口来聚合
     */
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始代理.....");
        target.teach();
        System.out.println("代理结束.....");
    }
}
