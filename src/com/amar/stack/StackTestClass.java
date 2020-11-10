package com.amar.stack;

public class StackTestClass {

    public static void main(String args[]) {
        StackX stack = new StackX(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
    }

}
