package cc.before30.algorithms.leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    List<Integer> ret = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root);

        return ret;
    }

    public void traverse(TreeNode node) {
        if (node == null) {
            return;
        }
        traverse(node.left);
        ret.add(node.val);
        traverse(node.right);
    }


}
