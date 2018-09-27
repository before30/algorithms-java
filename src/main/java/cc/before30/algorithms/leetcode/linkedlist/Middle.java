package cc.before30.algorithms.leetcode.linkedlist;

public class Middle {

    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp != null) {
            count++;
            temp = temp.next;
        }

        ListNode ans = head;
        for (int i = 0; i < count/2; i++) {
            ans = ans.next;
        }

        return ans;
    }

    public ListNode middleNode2(ListNode head) {
        ListNode[] tempArray = new ListNode[100];
        int t = 0;
        while (head.next != null) {
            tempArray[t++] = head;
            head = head.next;
        }

        return tempArray[t/2];
    }

    public ListNode middleNode3(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

}
