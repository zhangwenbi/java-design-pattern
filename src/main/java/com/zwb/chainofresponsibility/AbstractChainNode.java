package com.zwb.chainofresponsibility;

public abstract class AbstractChainNode {
    /**
     * 下一个节点对象
     */
    protected AbstractChainNode nextNode;

    /**
     * 设置下一个节点
     *
     * @param abstractChainNode 节点对象实例
     */
    public void setNextNode(AbstractChainNode abstractChainNode) {
        if (abstractChainNode != null) {
            this.nextNode = abstractChainNode;
        }
    }

    /**
     * 执行业务逻辑 该版本责任链Demo执行过程中会中断，即可能不会执行完所有节点
     *
     * @param num 业务参数
     */
    public boolean excute(int num) {
        boolean result = write(num);
        if (!result) {
            //当前节点如果执行失败，责任链执行结束
            return false;
        }

        //当前节点执行成功，判断是否还有下个节点需要执行，如果没有下个节点需要执行，则责任链所有节点均执行完毕，返回执行结果
        if (nextNode != null) {
            return nextNode.excute(num);
        } else {
            return true;
        }
    }

    /**
     * 执行业务逻辑 该版本责任链Demo执行过程中不会中断，会执行完所有节点
     *
     * @param num 业务参数
     */
//    public void excute(int num) {
//        write(num);
//        //判断是否还有下个节点需要执行
//        if (nextNode != null) {
//            nextNode.excute(num);
//        }
//    }
    abstract protected Boolean write(int num);

}
