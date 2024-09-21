package com.sample.bst;

public class NumberOfNodesByHeightInBST {

	public static void main(String[] args) {
		int height = 3;
        int maxNodes = maxNodesForHeight(height);
        int minNodes = minNodesForHeight(height);
        
        System.out.println("For a BST of height " + height + ":");
        System.out.println("Maximum number of nodes: " + maxNodes);
        System.out.println("Minimum number of nodes: " + minNodes);
	}
	
	// Function to calculate the maximum number of nodes for a given height
    public static int maxNodesForHeight(int height) {
        return (int) Math.pow(2, height + 1) - 1;
    }

    // Function to calculate the minimum number of nodes for a given height
    public static int minNodesForHeight(int height) {
        return height + 1;
    }

}
