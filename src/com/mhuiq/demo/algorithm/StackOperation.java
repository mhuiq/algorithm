package com.mhuiq.demo.algorithm;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列（先进先出），完成队列的Push和Pop操作。 队列中的元素为int类型。
 * Created by 80374361 on 2017/2/20.
 */
public class StackOperation {

    Stack<Integer> stack1 = new Stack<Integer>();   // 保存push操作的数据
    Stack<Integer> stack2 = new Stack<Integer>();   // 暂存pop操作的数据

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack1.empty()) {
            return 0;
        }
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        Integer rtn = stack2.pop();
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        return  rtn;
    }

    public static void main(String[] args) {
        StackOperation so = new StackOperation();
        for (int i = 0; i < 10 ; i++) {
            so.push(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(so.pop());
        }
    }
}
