package cc.before30.algorithms.leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


public class Solution {
    List<Integer> output = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (Objects.isNull(root)) {
            return output;
        }

        // left root right
        if (Objects.nonNull(root.left)) {
            inorderTraversal(root.left);
        }
        output.add(root.val);

        if (Objects.nonNull(root.right)) {
            inorderTraversal(root.right);
        }

        return output;
    }

//    public List<Integer> inorderTraversalIter(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode curr = root;
//        while (curr != null || !stack.isEmpty()) {
//            while (curr != null) {
//                stack.push(root);
//                curr = curr.left;
//            }
//
//            curr = stack.pop();
//            res.add(curr.val);
//            curr = curr.right;
//        }
//
//        return res;
//
//    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        TreeNode right = new TreeNode(2);
        TreeNode left = new TreeNode(3);
        right.left = left;
        right.right = null;
        root.right = right;

        System.out.println(new Solution().inorderTraversal(root));
    }
}
