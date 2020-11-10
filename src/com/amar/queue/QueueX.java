package com.amar.queue;

public class QueueX {
    private int front;
    private int rear;
    private int[] q;
    private int size;

    public QueueX(int size) {
        q = new int[size];
        front = 0;
        rear = -1;
        this.size = size;
    }

    public void insert(int j) {
        if (rear == size - 1) {
            rear = -1;
        }
        q[++rear] = j;
    }

    public int remove() {
        int tmp = q[front++];
        if (front == size) {
            front = 0;
        }
        return tmp;
    }

    public boolean isEmpty() {
        if (front - 1 == rear) {
            return true;
        }
        return false;
    }

    public void display() {
        System.out.print("\n ");
        for (int i : q) {
            System.out.print(" " + i);
        }
        System.out.print("\n ");
    }

}
