package com.zwb.observer;

/**
 * 观察者顶级父类
 */
public abstract class Observer {
    /**
     * 被观察者
     */
    protected Subject subject;

    /**
     * 更新方法，当观察者被更新后触发此更新方法
     */
    public abstract void update();
}
