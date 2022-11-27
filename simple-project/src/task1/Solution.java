package task1;

import java.util.Stack;

public class Solution {

    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode ln = head;

        while (ln.next != null) {
            stack.push(ln.val);
            ln = ln.next;
        }

        while (!stack.empty()) {
            if (head.val == stack.pop()) {
                head = head.next;
            } else {
                return false;
            }
        }
        return true;
    }
}
