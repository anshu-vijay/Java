package com.sample.bst;

import java.util.LinkedList;
import java.util.Queue;

//class TreeNode {
//    int val;
//    TreeNode left, right;
//
//    TreeNode(int x) {
//        val = x;
//        left = right = null;
//    }
//}

public class BFS {

	public static void main(String[] args) {
		// Creating a simple binary tree
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		System.out.println("BFS Traversal:");
		bfsTraversal(root);
	}

	public static void bfsTraversal(TreeNode root) {

		if (root == null) {
			return;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {
			TreeNode currentNode = q.poll(); // Get the front node
			System.out.print(currentNode.val + " "); // Process the current node
			if (currentNode.left != null) {
				q.add(currentNode.left);
			}
			if (currentNode.right != null) {
				q.add(currentNode.right);
			}
		}
	}
}
