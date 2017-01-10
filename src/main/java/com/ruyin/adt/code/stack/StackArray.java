package com.ruyin.adt.code.stack;

/**
 *  栈的数组实现
 */
public class StackArray<T> {
    //保存元素的栈
    T[] stackArray;
    //头部位置
    int topOfStack;

    public StackArray(int capacity){
        stackArray = (T[]) new Object[capacity];
        topOfStack = -1;
    }

    public int getSize(){
        return stackArray.length;
    }

    public int getTopOfStack() {
        return topOfStack;
    }

    public boolean isEmpty(){
        if(topOfStack == -1)
            return true;
        return false;
    }

    public boolean isFull(){
        if(topOfStack == getSize())
            return true;
        return false;
    }

    public void push(T ele){
        if(isFull())
            throw new RuntimeException("Stack overflow");
        topOfStack++;
        stackArray[topOfStack] = ele;
    }

    public T pop(){
        if(isEmpty())
            throw new RuntimeException("Stack empty");
        T obj = stackArray[topOfStack];
        //手动释放资源
        stackArray[topOfStack]=null;
        topOfStack--;
        return obj;
    }

    public T peek(){
        if(isEmpty())
            throw new RuntimeException("Stack is empty");

        return stackArray[topOfStack];
    }
}
