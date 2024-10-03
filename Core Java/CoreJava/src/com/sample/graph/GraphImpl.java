package com.sample.graph;

import java.util.*;

class GraphCreation {
    private Map<Integer, List<Integer>> adjList = adjList = new HashMap<>();; // Adjacency list representation

    // Step 2: Add a method to add a vertex
    public void addVertex(int vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    // Step 3: Add a method to add an edge
    public void addEdge(int source, int destination) {
        adjList.putIfAbsent(source, new ArrayList<>());
        adjList.putIfAbsent(destination, new ArrayList<>());

        adjList.get(source).add(destination);   // Directed graph: Edge from source to destination
        adjList.get(destination).add(source);   // Undirected graph: Edge from destination to source
    }

    // Step 4: Print the graph (Adjacency List)
    public void printGraph() {
        for (Integer vertex : adjList.keySet()) {
            System.out.print(vertex + " -> ");
            List<Integer> neighbors = adjList.get(vertex);
            for (Integer neighbor : neighbors) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    // Perform DFS traversal starting from the given source
    public void dfs(int start, Set<Integer> visited) {
        visited.add(start); // Mark the current node as visited

        // Explore all the neighbors of the current node
        for (int neighbor : adjList.get(start)) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, visited); // Recursively visit unvisited neighbors
            }
        }
    }

    // Perform BFS traversal starting from the given source
    public void bfs(int start, Set<Integer> visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            // Explore all the neighbors of the current node
            for (int neighbor : adjList.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

    // Find all disconnected vertices in the graph
    public List<Integer> findDisconnectedVertices() {
        Set<Integer> visited = new HashSet<>();
        List<Integer> disconnectedVertices = new ArrayList<>();

        // Start BFS from the first vertex in the graph (if it exists)
        if (!adjList.isEmpty()) {
            int start = adjList.keySet().iterator().next();  // Start BFS from the first node
            bfs(start, visited);  // BFS traversal
//            dfs(start, visited);  //DFS traversal
        }

        // Any vertex not visited during BFS is disconnected
        for (Integer vertex : adjList.keySet()) {
            if (!visited.contains(vertex)) {
                disconnectedVertices.add(vertex);
            }
        }

        return disconnectedVertices;
    }
}

public class GraphImpl {
    public static void main(String[] args) {
        GraphCreation graph = new GraphCreation();

        // Adding vertices
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5); // This vertex will be disconnected

        // Adding edges (Undirected graph)
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Printing the graph
        System.out.println("Graph representation:");
        graph.printGraph();

        // Find and print disconnected vertices
        List<Integer> disconnectedVertices = graph.findDisconnectedVertices();
        System.out.println("Disconnected vertices: " + disconnectedVertices);
    }

}