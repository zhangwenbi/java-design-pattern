package com.zwb.observer;

/**
 * 观察者模式：模拟业务逻辑，修改Subject的state值，查看观察者的动作
 */
public class DemoTest {

    public static void main(String[] args) {
        Subject subject = new Subject();

        //创建观察者，将被观察者对象实例传给观察者
        new ObserverOne(subject);
        new ObserverTwo(subject);
        new ObserverThree(subject);

        subject.setState(187);
    }

}
