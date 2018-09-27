package cc.before30.algorithms.leetcode.linkedlist;

public class WalkerRunner {
    public ListNode solve(ListNode head) {
        // Walker : 1 step
        // Runner : 2 step
        // runner 가 끝나면 walker 는 중간에 와있음
        ListNode walker = head;
        ListNode runner = head;

        while (runner != null) {
            runner = runner.next;
            if (runner != null) {
                walker = walker.next;
                runner = runner.next;
            }
        }

        return walker;
    }
}
