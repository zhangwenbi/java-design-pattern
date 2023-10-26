package com.zwb.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式 被观察对象
 */
public class Subject {
    /**
     * 观察者列表
     */
    private List<Observer> list = new ArrayList<Observer>();

    /**
     * 模拟数据变动，当此数据被修改，观察者需要做出对应的修改操作
     */
    private int state;

    public int getState() {
        return this.state;
    }

    public void setState(int state) {
        this.state = state;
        //通知所有观察者执行修改操作
        notifyAllObservers();
    }

    /**
     * 往观察者列表中添加观察者对象
     *
     * @param observer 观察者对象
     */
    public void attach(Observer observer) {
        list.add(observer);
    }

    /**
     * 唤醒所有观察者执行更新操作
     */
    public void notifyAllObservers() {
        if (!list.isEmpty()) {
            for (Observer observer : list) {
                observer.update();
            }
        }
    }

}
