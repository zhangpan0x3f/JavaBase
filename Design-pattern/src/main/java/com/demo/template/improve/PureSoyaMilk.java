package com.demo.template.improve;

/**
 * @author zhang pan
 * @date 2021/4/25 2:30 下午
 */
public class PureSoyaMilk extends SoyaMilk{
    @Override
    void addCondiments() {

    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
