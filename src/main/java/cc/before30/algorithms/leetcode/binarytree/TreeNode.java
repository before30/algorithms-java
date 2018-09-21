package cc.before30.algorithms.leetcode.binarytree;

public class TreeNode {
    int val;

    TreeNode left;

    TreeNode right;

    TreeNode(int x) {
        this.val = x;
    }

    public void addNode(int x) {
        if (this.val > x) {
            if (this.left == null) {
                this.left = new TreeNode(x);
            } else {
                this.left.addNode(x);
            }
        } else {
            if (this.right == null) {
                this.right = new TreeNode(x);
            } else {
                this.right.addNode(x);
            }
        }
    }
}
