package com.amar.graph;

public class GraphAdjacencyTest {

	public static void main(String args[]) {
		GraphAdjacency x = new GraphAdjacency(9);
		x.addVertex('A');
		x.addVertex('B');
		x.addVertex('C');
		x.addVertex('D');
		x.addVertex('E');
		x.addVertex('F');
		x.addVertex('G');
		x.addVertex('H');
		x.addVertex('I');
		x.addEdge(0, 1);
		x.addEdge(0, 2);
		x.addEdge(0, 3);
		x.addEdge(0, 4);

		x.addEdge(1, 5);
		x.addEdge(5, 7);
		x.addEdge(3, 6);
		x.addEdge(6, 8);

		x.dfs(0);

	}
}
