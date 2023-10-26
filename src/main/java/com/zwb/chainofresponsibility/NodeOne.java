package com.zwb.chainofresponsibility;

/**
 * 责任链模式：节点一
 */
public class NodeOne extends AbstractChainNode {
    protected Boolean write(int num) {
        if (num >= 1) {
            System.out.println("一号节点校验通过...");
            return true;
        }
        return false;
    }
}
