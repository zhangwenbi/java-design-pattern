package com.zwb.chainofresponsibility;

/**
 * 责任链模式
 */
public class DemoTest {

    /**
     * 组装责任链
     *
     * @return
     */
    public static final AbstractChainNode getChainOfResponsibility() {
        //根据业务场景，自由组装责任链
        NodeOne nodeOne = new NodeOne();
        NodeTwo nodeTwo = new NodeTwo();
        NodeThree nodeThree = new NodeThree();
        NodeFour nodeFour = new NodeFour();

        nodeOne.setNextNode(nodeTwo);
        nodeTwo.setNextNode(nodeThree);
        nodeThree.setNextNode(nodeFour);

        //返回责任链头节点
        return nodeOne;
    }

    public static void main(String[] args) {

        //模拟调用责任链
        AbstractChainNode chainOfResponsibility = getChainOfResponsibility();
        boolean excute = chainOfResponsibility.excute(4);
        System.out.println("所有节点是否全部执行完：" + excute);

    }

}
