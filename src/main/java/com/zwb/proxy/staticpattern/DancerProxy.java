package com.zwb.proxy.staticpattern;

/**
 * 静态代理类
 */
public class DancerProxy implements Dancer {
    private Dancer dancer;

    public DancerProxy(Dancer dancer) {
        this.dancer = dancer;
    }

    public void dance() {
        System.out.println("热身......");
        dancer.dance();
        System.out.println("致谢......");
    }

}
