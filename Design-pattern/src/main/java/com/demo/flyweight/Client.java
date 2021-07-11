package com.demo.flyweight;

/**
 * @author zhang pan
 * @date 2021/4/20 1:54 下午
 */
public class Client {
    public static void main(String[] args) {
        //创建一个工厂类
        WebSiteFactory factory = new WebSiteFactory();

        //客户要一个以新闻形式发布的网站
        WebSite website1 = factory.getWebSiteCategory("新闻");
        website1.use(new User("Tom"));

        //客户要一个以博客形式发布的网站
        WebSite website2 = factory.getWebSiteCategory("博客");
        website2.use(new User("Jack"));

        //客户要一个以博客形式发布的网站
        WebSite website3 = factory.getWebSiteCategory("博客");
        website3.use(new User("Smith"));

        //客户要一个以博客形式发布的网站
        WebSite website4 = factory.getWebSiteCategory("博客");
        website4.use(new User("King"));

        System.out.println(factory.getWebSiteCount());
    }
}
