package com.ruyin.adt.code.stack;

import org.junit.Test;

/**
 * Created by ruyin on 17-1-11.
 */
public class StackStructTest {

    @Test
    public void testList(){
        StackList stack = new StackList(100);
        for(int i=0;i< stack.getSize();i++){
            StackNode node = new StackNode(i);
            stack.push(node);
        }
        System.out.println(stack);
        for(int j = 0;j< stack.getSize();j++){
            stack.pop();
        }
    }

    @Test
    public void testArray(){
        StackArray stackArray = new StackArray(100);
        for(int i=0;i< stackArray.getSize();i++){
            stackArray.push("wxz"+i);
        }
        System.out.println(stackArray);
        for(int j =0 ;j<stackArray.getSize();j++){
            stackArray.pop();
        }
    }
}
