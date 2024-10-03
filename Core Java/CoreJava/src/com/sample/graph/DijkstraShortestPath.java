package com.sample.graph;
import java.util.*;

class Graph {
    // Adjacency list to store the graph (node -> list of neighbors with cost)
    private Map<Integer, List<Edge>> adjList = new HashMap<>();


    // Class to represent an edge between two nodes with a cost
    static class Edge {
        int target;
        int weight;

        Edge(int target, int weight) {
            this.target = target;
            this.weight = weight;
        }
    }

    // Add an edge to the graph (undirected graph)
    public void addEdge(int source, int target, int weight) {
        adjList.putIfAbsent(source, new ArrayList<>());
        adjList.putIfAbsent(target, new ArrayList<>());

        adjList.get(source).add(new Edge(target, weight));
        adjList.get(target).add(new Edge(source, weight)); // Comment this line if the graph is directed
    }

    // Find the shortest distance between two nodes using Dijkstra's algorithm
    public int shortestPath(int start, int end) {
        // Min-heap (priority queue) to store the nodes along with their current distances
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));

        // Map to store the minimum distance to each node
        Map<Integer, Integer> distances = new HashMap<>();

        // Initialize the starting node's distance to 0 and others to infinity (or a large number)
        for (int node : adjList.keySet()) {
            distances.put(node, Integer.MAX_VALUE);
        }
        distances.put(start, 0);

        // Start the heap with the starting node
        minHeap.add(new int[]{start, 0});

        // Dijkstra's Algorithm
        while (!minHeap.isEmpty()) {
            int[] current = minHeap.poll();
            int currentNode = current[0];
            int currentDistance = current[1];

            // If we reached the end node, return the distance
            if (currentNode == end) {
                return currentDistance;
            }

            // If the current distance is greater than the known distance, skip
            if (currentDistance > distances.get(currentNode)) {
                continue;
            }

            // Explore neighbors
            for (Edge edge : adjList.get(currentNode)) {
                int neighbor = edge.target;
                int newDist = currentDistance + edge.weight;

                // If a shorter path is found, update the distance and push it to the heap
                if (newDist < distances.get(neighbor)) {
                    distances.put(neighbor, newDist);
                    minHeap.add(new int[]{neighbor, newDist});
                }
            }
        }

        // If the end node is unreachable, return -1 (or some indication of no path)
        return -1;
    }

    // Print the adjacency list (for debugging purposes)
    public void printGraph() {
        for (int node : adjList.keySet()) {
            System.out.print(node + " -> ");
            for (Edge edge : adjList.get(node)) {
                System.out.print("(" + edge.target + ", " + edge.weight + ") ");
            }
            System.out.println();
        }
    }
}

public class DijkstraShortestPath {
    public static void main(String[] args) {
        Graph graph = new Graph();

        // Adding edges (example)
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 1);
        graph.addEdge(2, 1, 2);
        graph.addEdge(1, 3, 1);
        graph.addEdge(2, 3, 5);

        // Printing the graph structure
        System.out.println("Graph structure:");
        graph.printGraph();

        // Finding the shortest path between two nodes
        int start = 0;
        int end = 3;
        int distance = graph.shortestPath(start, end);

        if (distance != -1) {
            System.out.println("Shortest distance between " + start + " and " + end + " is: " + distance);
        } else {
            System.out.println("No path found between " + start + " and " + end);
        }
    }
}
