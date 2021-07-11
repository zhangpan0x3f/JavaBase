package com.demo.flyweight;

/**
 * @author zhang pan
 * @date 2021/4/20 11:45 上午
 */
public class ConcreteWebSite extends WebSite{

    /**
     * 网站发布的形式（类型）
     */
    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站发布的形式为：" + type + " 在使用中...使用者是" + user.getName());
    }

}
