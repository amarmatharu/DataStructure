package com.amar.graph;

public class GraphTestClass {

    public static void main(String args[]) {
        GraphX x = new GraphX(9);
        x.addVertex('A');
        x.addVertex('B');
        x.addVertex('C');
        x.addVertex('D');
        x.addVertex('E');
        x.addVertex('F');
        x.addVertex('G');
        x.addVertex('H');
        x.addVertex('I');
        x.insertEdgeDirectedGraph(0, 1);
        x.insertEdgeDirectedGraph(0, 2);
        x.insertEdgeDirectedGraph(0, 3);
        x.insertEdgeDirectedGraph(0, 4);

        x.insertEdgeDirectedGraph(1, 5);
        x.insertEdgeDirectedGraph(5, 7);
        x.insertEdgeDirectedGraph(3, 6);
        x.insertEdgeDirectedGraph(6, 8);

        x.dfs();

    }

}
