package com.amar.graph;

public class Vertex {

    public char label;
    public boolean isVisited;

    public Vertex(char data) {
        this.label = data;
        isVisited = false;
    }
}
