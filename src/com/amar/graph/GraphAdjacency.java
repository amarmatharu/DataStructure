package com.amar.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GraphAdjacency {
	private List<List<Integer>> graph;
	private Vertex[] vertexList;
	private int noOfVert;

	public GraphAdjacency(int nodes) {
		graph = new ArrayList<>();
		vertexList = new Vertex[nodes];

		for (int i = 0; i < nodes; i++) {
			graph.add(i, new ArrayList<>());
		}
		noOfVert = 0;
	}

	public void addVertex(char data) {
		Vertex v = new Vertex(data);
		vertexList[noOfVert++] = v;
	}

	public void addEdge(int a, int b) {
		graph.get(a).add(b);
		graph.get(b).add(a);
	}

	public void dfs(int start) {
		Stack<Integer> stack = new Stack<>();
		stack.push(start);
		vertexList[start].isVisited = true;
		//System.out.println(vertexList[start].label + " ");
		
		// visited[start] = true;
		while (!stack.isEmpty()) {

			int node = stack.pop();
			System.out.println(vertexList[node].label + " ");
			
			List<Integer> neighbours = graph.get(node);
			for (int i : neighbours) {
				if (!vertexList[i].isVisited) {
					stack.push(i);
					
					vertexList[i].isVisited = true;
				}
			}
			//System.out.println("\n");
		}

	}
}
