package com.amar.graph;

import com.amar.stack.StackX;

public class GraphX {

    private Vertex[] vertexList;
    private int[][] adjMatrix;
    private int noOfVert;
    private StackX stack;


    public GraphX(int size) {
        vertexList = new Vertex[size];
        adjMatrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                adjMatrix[i][j] = 0;
            }
        }
        noOfVert = 0;
        stack = new StackX(size);
    }

    public void addVertex(char data) {
        Vertex v = new Vertex(data);
        vertexList[noOfVert++] = v;
    }

    public void insertEdgeDirectedGraph(int start, int end) {
        adjMatrix[start][end] = 1;
    }

    public void insertEdgeBiDirectionalGraph(int start, int end) {
        adjMatrix[start][end] = 1;
    }

    public void dfs() {
        vertexList[0].isVisited = true;
        display(0);
        stack.push(0);

        while (!stack.isEmpty()) {
            int v = getAdjMatrUnvisited(stack.peek());
            if (v == -1) {
                stack.pop();
            } else {
                vertexList[v].isVisited = true;
                display(v);
                stack.push(v);
            }
        }
    }

    public void bfs()
    {

    }

    public int getAdjMatrUnvisited(int i) {
        for (int j = 0; j < noOfVert; j++) {
            if (adjMatrix[i][j] == 1 && vertexList[j].isVisited == false) {
                return j;
            }
        }
        return -1;
    }

    public void display(int v) {
        System.out.println(vertexList[v].label);
    }


}
