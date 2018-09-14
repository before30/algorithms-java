package cc.before30.algorithms.leetcode.minstack;

public class Element {

    private final int value;

    private final int min;

    public Element(int value, int min) {
        this.value = value;
        this.min = min;
    }

    public int getValue() {
        return value;
    }

    public int getMin() {
        return min;
    }
}
