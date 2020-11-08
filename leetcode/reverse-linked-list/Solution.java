//reverse-linked-list: https://leetcode.com/problems/reverse-linked-list/ Complete

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        Stack<Integer> stack = new Stack<>();
        while(head != null) {
            stack.push(head.val);
            head = head.next;
        }
        ListNode n = new ListNode();
        recursive(n, stack);
        
        return n;
    }
    
    public void recursive(ListNode n, Stack<Integer> stack) {
        n.val = stack.pop();
        if(!stack.isEmpty()) {
            n.next = new ListNode();
            recursive(n.next, stack);
        }
    }
    
    
}
