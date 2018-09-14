package cc.before30.algorithms.leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class TreeNode {
    int val;

    TreeNode left;

    TreeNode right;

    TreeNode(int x) {
        this.val = x;
    }
}

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
