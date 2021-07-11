package com.demo.template.improve;

/**
 * @author zhang pan
 * @date 2021/4/25 2:03 下午
 */

/**
 * 抽象类，表示豆浆
 */
public abstract class SoyaMilk {

    /**
     * 模版方法make,模板方法可以做成final，不让子类去覆盖
     */
    final void make(){
        select();
        if(customerWantCondiments()){
            addCondiments();
        }
        soak();
        beat();
    }

    /**
     * 选材料
     */
    private void select(){
        System.out.println("第一步：选择好的新鲜黄豆");
    }

    /**
     * 添加不同的配料，抽象方法，子类具体实现
     */
    abstract void addCondiments();

    /**
     * 浸泡
     */
    private void soak(){
        System.out.println("第三步：黄豆和配料开始浸泡，需要3小时");
    }

    /**
     *
     */
    private void beat(){
        System.out.println("第四步：黄豆和配料方法豆浆机中去打碎");
    }

    boolean customerWantCondiments(){
        return true;
    }

}
