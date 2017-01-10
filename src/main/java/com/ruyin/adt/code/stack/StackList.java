package com.ruyin.adt.code.stack;

/**
 *  使用单链表实现栈
 */
public class StackList {
    //定义栈顶节点
    StackNode header;
    //栈内元素个数
    int eleCount;
    //定义栈的大小
    int size;

    //定义空栈
    public StackList(){
        header = null;
        eleCount = 0;
        size = 0;
    }

    //构造自定义大小栈
    public StackList(int size){
        header = null;
        eleCount = 0;
        this.size = size;
    }

    //获取栈大小
    public int getSize() {
        return size;
    }

    //设置栈大小
    public void setSize(int size) {
        this.size = size;
    }

    //设置栈顶元素
    public void setHeader(StackNode header) {
        this.header = header;
    }

    //判断栈是否为空
    public boolean isEmpty(){
        if(eleCount == 0)
            return true;
        return false;
    }

    //判断栈是否满了
    public boolean isFull(){
        if(eleCount == size)
            return true;
        return  false;
    }

    //入栈
    public void push(Object object){
        if(isFull())
            throw new RuntimeException("Stack overflow");
        header = new StackNode(header,object);
        eleCount++;
    }

    /*public void push(StackNode node){
        if(isFull())
            throw new RuntimeException("Stack overflow");
        header = node;
        eleCount++;
    }*/

    //出栈,并返回出栈元素
    public Object pop(){
        if(isEmpty())
            throw new RuntimeException("Stack is empty");
        Object object = header.getElement();
        header = header.getNext();
        eleCount--;
        return object;
    }

    //返回栈顶元素
    public Object peek(){
        if(isEmpty())
            throw new RuntimeException("Stack is empty");

        return header.getElement();
    }
}
