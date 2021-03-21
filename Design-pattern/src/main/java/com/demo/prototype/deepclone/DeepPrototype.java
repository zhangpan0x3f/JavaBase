package com.demo.prototype.deepclone;

import java.io.*;

/**
 * @author 张攀
 * @date 2021/2/12 15:44
 * 描述：
 */
public class DeepPrototype implements Serializable,Cloneable {

    //string类型属性
    public String name;

    //引用类型属性
    public DeepCloneableTarget deepCloneTarget;

    public DeepPrototype() {
    }

    //深拷贝--方式1 clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //完成对基本数据类型(属性)和String的克隆
        deep = super.clone();
        //对引用类型的属性进行单独处理
        DeepPrototype deepPrototype = (DeepPrototype) deep;
        deepPrototype.deepCloneTarget = (DeepCloneableTarget) deepCloneTarget.clone();
        return deepPrototype;
    }

    //深拷贝--方式2 通过对象的序列化实现
    protected Object deepclone()  {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try{
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列话
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepPrototype deep = (DeepPrototype) ois.readObject();
            return deep;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try {
                ois.close();
                bis.close();
                oos.close();
                bos.close();
            }catch (Exception e2){
                System.out.println(e2.getMessage());
            }
        }
    }

}
