package com.amar.stack;

/*
 general utility class to implement stack. The class provides basic functionality to implement First in Last out principal
 */
public class StackX {
    private int top;
    private int[] st;

    public StackX(int size) {
        top = -1;
        st = new int[size];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int peek() {
        return st[top];
    }

    public void push(int data) {
        st[++top] = data;
    }

    public int pop() {
        return st[top--];
    }

    public void display() {
        for (int i : st) {
            System.out.print(" " + i);
        }
        System.out.println("\n");
    }

}
