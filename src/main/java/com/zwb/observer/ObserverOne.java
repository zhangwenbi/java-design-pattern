package com.zwb.observer;

/**
 * 观察者一
 */
public class ObserverOne extends Observer {

    public ObserverOne(Subject subject) {
        /**
         * 添加被观察者对象
         */
        super.subject = subject;
        subject.attach(this);
    }

    /**
     * 观察者更新逻辑
     */
    public void update() {
        System.out.println("观察者一执行修改操作，监测到被观察者对象state值更新为：" + subject.getState());
    }
}
