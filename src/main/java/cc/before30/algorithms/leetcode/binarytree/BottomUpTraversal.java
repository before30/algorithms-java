package cc.before30.algorithms.leetcode.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BottomUpTraversal {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> ret = new LinkedList<>();
        if (root == null) {
            return ret;
        }

        List<TreeNode> currentLevel = new ArrayList<>();
        currentLevel.add(root);


        while (!currentLevel.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            List<TreeNode> nextLevelNode = new ArrayList<>();

            for (TreeNode current : currentLevel) {
                level.add(current.val);
                if (current.left != null) {
                    nextLevelNode.add(current.left);
                }

                if (current.right != null) {
                    nextLevelNode.add(current.right);
                }
            }
            ((LinkedList<List<Integer>>) ret).addFirst(level);
            currentLevel = nextLevelNode;
        }

        return ret;
    }

    public static void main(String[] args) {
        /*
    3
   / \
  9  20
    /  \
   15   7
         */
        TreeNode num3 = new TreeNode(3);
        TreeNode num9 = new TreeNode(9);
        TreeNode num20 = new TreeNode(20);
        TreeNode num15 = new TreeNode(15);
        TreeNode num7 = new TreeNode(7);
        num3.left = num9;
        num3.right = num20;
        num20.left = num15;
        num20.right = num7;

//        TreeNode root = new TreeNode(1);
//        root.left = null;
//        TreeNode right = new TreeNode(2);
//        TreeNode left = new TreeNode(3);
//        right.left = left;
//        right.right = null;
//        root.right = right;
//
        System.out.println(new BottomUpTraversal().levelOrderBottom(num3));
    }
}
