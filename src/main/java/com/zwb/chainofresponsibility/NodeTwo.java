package com.zwb.chainofresponsibility;

/**
 * 责任链模式：节点二
 */
public class NodeTwo extends AbstractChainNode {
    protected Boolean write(int num) {
        if (num >= 2) {
            System.out.println("二号节点校验通过...");
            return true;
        }
        return false;
    }
}
