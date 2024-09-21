package com.sample.bst;

//class TreeNode {
//    int val;
//    TreeNode left, right;
//
//    TreeNode(int x) {
//        val = x;
//        left = right = null;
//    }
//}

public class BSTDeletion {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        System.out.println("BST before deletion:");
        inorderTraversal(root);
        System.out.println("\n");

        root = deleteNode(root, 50);

        System.out.println("BST after deletion:");
        inorderTraversal(root);
    }

    // Function to perform in-order traversal
    public static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }

    // Function to delete a node from the BST
    public static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root; // Base case: if the root is null, return null
        }

        // Recursively find the node to be deleted
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            // Node to be deleted found

            // Case 1: Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 2: Node with two children
            // Find the in-order successor (smallest in the right subtree)
            root.val = minValue(root.right);

            // Delete the in-order successor
            root.right = deleteNode(root.right, root.val);
        }

        return root;
    }

    // Function to find the minimum value node in the given subtree
    public static int minValue(TreeNode root) {
        int minVal = root.val;
        while (root.left != null) {
            root = root.left;
            minVal = root.val;
        }
        return minVal;
    }
}
