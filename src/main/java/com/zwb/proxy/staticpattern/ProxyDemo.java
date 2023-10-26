package com.zwb.proxy.staticpattern;

public class ProxyDemo {
    public static void main(String[] args) {
        DancerProxy folk = new DancerProxy(new FolkDancer());
        folk.dance();

        DancerProxy hiphop = new DancerProxy(new HipHopDancer());
        hiphop.dance();

        DancerProxy breakDance = new DancerProxy(new BreakDancer());
        breakDance.dance();
    }
}
