/*
Construct Binary Tree from Inorder and Postorder Traversal
https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/

Given inorder and postorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.
*/

package leetcode.construct_binary_tree_from_inorder_and_postorder_traversal;

public class Solution {

    int endPost;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int length = postorder.length;
        endPost = length - 1;

        return buildTree(inorder, postorder, 0, length - 1);
    }

    TreeNode buildTree(int[] in, int[] post, int startIn, int endIn) {
        if (endIn < startIn) return null;
        int nodeVal = post[endPost--];
        TreeNode node = new TreeNode(nodeVal);
        int nodePosition = findNode(nodeVal, in, startIn, endIn);
        node.right = buildTree(in, post, nodePosition + 1, endIn);
        node.left = buildTree(in, post, startIn, nodePosition - 1);

        return node;
    }

    private int findNode(int val, int[] mas, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (mas[i] == val) return i;
        }

        return -1;
    }
}