package cc.before30.algorithms.leetcode.minstack;

import java.util.LinkedList;
import java.util.Objects;

public class MinStack {

    private LinkedList<Element> stack = new LinkedList<>();

    public MinStack() {

    }

    public void push(int x) {
        Element element = new Element(x, Math.min(x, this.getMin()));
        stack.push(element);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        Element element = stack.peekFirst();
        if (Objects.nonNull(element)) {
            return element.getValue();
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public int getMin() {
        Element element = stack.peekFirst();
        if (Objects.nonNull(element)) {
            return element.getMin();
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(3);
        obj.push(6);
        obj.push(2);
        obj.push(10);
        obj.push(1);

        System.out.println(obj.getMin()); // 1
        obj.pop();
        System.out.println(obj.getMin()); // 2
        obj.pop();
        System.out.println(obj.getMin()); // 2
        obj.pop();
        System.out.println(obj.getMin()); // 3
        obj.pop();
        System.out.println(obj.getMin()); // 3
        obj.pop();
        System.out.println(obj.getMin()); // 10000

    }
}
