package cc.before30.algorithms.leetcode.binarytree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthSmallestElem {
    public List<Integer> list = new ArrayList<>();

    public int kthSmallest(TreeNode root, int k) {
        inordersearch(root);
        return list.get(k-1);
    }

    public void inordersearch(TreeNode node) {
        if (node == null) return;
        inordersearch(node.left);
        list.add(node.val);
        inordersearch(node.right);
    }

    public TreeNode binaryTree(List<Integer> list) {

        TreeNode root = new TreeNode(list.get(0));
        for (int i=1; i<list.size(); i++) {
            if (list.get(i) != null) {
                root.addNode(list.get(i));
            }
        }

        return root;
    }

    public static void main(String[] args) {
        KthSmallestElem kthSmallest = new KthSmallestElem();
        TreeNode root1 = kthSmallest.binaryTree(Arrays.asList(3, 1, 4, null, 2));
        System.out.println(kthSmallest.kthSmallest(root1, 1));

        TreeNode root2 = kthSmallest.binaryTree(Arrays.asList(5,3,6,2,4,null, null, 1));
        System.out.println(kthSmallest.kthSmallest(root2, 3));
    }
}
