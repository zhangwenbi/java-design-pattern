package com.zwb.singleton;

/**
 * 饿汉式 线程安全
 */
public class HungryMan {
    /**
     * 静态对象随着类的加载而创建，无需手动创建，而类只会加载一次，所以该对象也只会创建一次，使用时直接获取即可，线程安全
     */
    private static HungryMan hungryMan = new HungryMan();

    private HungryMan() {
    }

    public static HungryMan getHungryMan() {
        return hungryMan;
    }
}
