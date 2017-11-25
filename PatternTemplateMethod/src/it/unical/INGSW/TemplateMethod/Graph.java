package it.unical.INGSW.TemplateMethod;

import java.util.ArrayList;
import java.util.HashMap;

class Node {

	public Node() {

		adjacencyList = new ArrayList<Node>();

	}

	Integer label;
	ArrayList<Node> adjacencyList;

	Integer getValue(int j) {
		return adjacencyList.get(j).label;
	}
}

public class Graph {

	HashMap<Integer, Node> graph;
	int n;

	public Graph(int n) {
		this.n = n;
		graph = new HashMap<Integer, Node>(n);

	}

	boolean isConnected(int i, int j) {

		Integer v = graph.get(i).getValue(j);

		if (v != null)
			return true;

		return false;

	}

	public int getN() {
		return n;
	}

}
