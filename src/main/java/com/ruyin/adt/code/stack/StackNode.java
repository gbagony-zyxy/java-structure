package com.ruyin.adt.code.stack;

/**
 *  栈节点
 */
public class StackNode<T> {
    //存入栈的元素
    T element;
    //相邻节点
    StackNode<T> next;

    public StackNode(T element){
        this(null,element);
    }

    public StackNode(StackNode node,T element){
        this.next = node;
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public StackNode<T> getNext() {
        return next;
    }

    public void setNext(StackNode<T> next) {
        this.next = next;
    }
}
