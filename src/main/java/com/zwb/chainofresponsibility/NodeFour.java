package com.zwb.chainofresponsibility;

/**
 * 责任链模式：节点四
 */
public class NodeFour extends AbstractChainNode {
    protected Boolean write(int num) {
        if (num >= 4) {
            System.out.println("四号节点校验通过...");
            return true;
        }
        return false;
    }
}
