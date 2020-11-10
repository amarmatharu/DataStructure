package com.amar.queue;

public class QueueTestClass {

    public static void main(String args[])
    {
        QueueX x = new QueueX(5);
        x.insert(1);
        x.insert(2);
        x.insert(3);
        x.insert(4);
        x.insert(5);

        x.display();
        System.out.println(x.remove());
        x.display();
        System.out.println(x.isEmpty());
        System.out.println(x.remove());
        System.out.println(x.remove());
        System.out.println(x.remove());
        System.out.println(x.remove());
        System.out.println(x.remove());
        System.out.println(x.isEmpty());



    }

}
