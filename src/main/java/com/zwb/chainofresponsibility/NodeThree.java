package com.zwb.chainofresponsibility;

/**
 * 责任链模式：节点三
 */
public class NodeThree extends AbstractChainNode {
    protected Boolean write(int num) {
        if (num >= 3) {
            System.out.println("三号节点校验通过...");
            return true;
        }
        return false;
    }
}
