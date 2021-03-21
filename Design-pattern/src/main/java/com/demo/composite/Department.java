package com.demo.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张攀
 * @date 2021/2/17 13:07
 * 描述：
 */
public class Department extends OrganizationComponent{

    List<OrganizationComponent> l = new ArrayList<>();

    public Department(String name, String des) {
        super(name, des);
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
        System.out.println(getName());
    }
}
