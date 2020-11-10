package com.amar.trie;

public class ConstructorCheck {

    ConstructorCheck(int x)
    {
        System.out.println("inside constructor 1: " + x);
    }

    ConstructorCheck(int x, int y)
    {
        this(x);
        System.out.println("inside constructor 2: " + y);
    }

    public static void main(String args[])
    {
        ConstructorCheck obj = new ConstructorCheck(5,10);
    }

}
