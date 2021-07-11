package com.demo.composite;

/**
 * @author 张攀
 * @date 2021/2/17 12:03
 * 描述：
 */
public abstract class OrganizationComponent {

    /**
     *名字
     */
    private String name;

    /**
     * 描述
     */
    private String des;

    protected void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    /***
     * 打印
     */
    public abstract void print();

}
