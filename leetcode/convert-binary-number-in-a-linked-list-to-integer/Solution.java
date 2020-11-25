//convert-binary-number-in-a-linked-list-to-integer: https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/ Complete

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
    public int getDecimalValue(ListNode head) {
        return Integer.parseInt(getBinaryStr(head),2);
    }
    
    public String getBinaryStr(ListNode n) {
        if(n == null) {
            return "";
        }
        return n.val + getBinaryStr(n.next);
    }
}
