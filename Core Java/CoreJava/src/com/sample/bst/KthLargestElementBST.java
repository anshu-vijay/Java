package com.sample.bst;

//class TreeNode {
//	int val;
//	TreeNode left, right;
//
//	TreeNode(int x) {
//		val = x;
//		left = null;
//		right = null;
//	}
//}


public class KthLargestElementBST {	
int count = 0;
int res = -1;

	public int kthLargest(TreeNode root, int k) {
		reverseInorder(root, k);
		return res;
	}

	private void reverseInorder(TreeNode node, int k) {
		if (node == null || count >=k) {
			return;
		}
		reverseInorder(node.right, k);
		count ++;
		if (count == k) {
			res = node.val;
			return;
		}
		reverseInorder(node.left, k);
	}

	public static void main(String[] args) {
//	    5
//	    / \
//	   3   7
//	  / \ / \
//	 2  4 6  8
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(8);

		KthLargestElementBST finder = new KthLargestElementBST();
		int k = 3;
		int kthLargest = finder.kthLargest(root, k);
		System.out.println(k + "-th largest element is " + kthLargest); // Output: 6
	}
}
