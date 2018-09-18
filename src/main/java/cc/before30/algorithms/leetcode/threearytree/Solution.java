package cc.before30.algorithms.leetcode.threearytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class Solution {

    public int maxDepth(Node root) {
        int depth = 0;
        if (root == null) {
            return depth;
        }

        List<Node> current = new ArrayList<>();
        current.add(root);

        while(!current.isEmpty()) {
            List<Node> childrenNodes = new ArrayList<>();
            for (Node node : current) {
                childrenNodes.addAll(node.children);
            }
            current = childrenNodes;
            depth++;
        }

        return depth;
    }

    public static void main(String[] args) {

    }
}
