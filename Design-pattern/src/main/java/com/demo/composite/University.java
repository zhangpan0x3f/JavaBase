package com.demo.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张攀
 * @date 2021/2/17 12:49
 * 描述：
 */
public class University extends OrganizationComponent{

    List<OrganizationComponent> l = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        l.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        l.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public void print() {
        System.out.println("++++++++++++" + getName() + "++++++++++++");
        for (OrganizationComponent o:l) {
            o.print();
        }
    }
}
