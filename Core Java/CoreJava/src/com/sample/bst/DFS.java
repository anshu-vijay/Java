package com.sample.bst;

public class DFS {

	public static void main(String[] args) {
		 // Creating a simple binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println("DFS Traversal (Recursive):");
        dfsRecursive(root);

	}
	
	 public static void dfsRecursive(TreeNode root) {
	        if (root == null) return;

	        System.out.print(root.val + " "); // Process the current node
	        dfsRecursive(root.left); // Traverse left subtree
	        dfsRecursive(root.right); // Traverse right subtree
	    }

}
