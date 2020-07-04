package merge_two_sorted_lists;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        Queue<Integer> pq = new PriorityQueue();
        if(l1 != null) add(pq,l1);
        if(l2 != null) add(pq,l2);
        ListNode l = new ListNode();
        create(pq,l);
        return l;
    }

    private static void create(Queue<Integer> pq, ListNode l) {
        if(!pq.isEmpty()) {
            l.val = pq.poll();
            if(!pq.isEmpty()) {
                l.next = new ListNode();
                create(pq, l.next);
            }
        }
    }

    private static void add(Queue pq, ListNode l) {
        pq.add(l.val);
        if(l.next != null) {
            add(pq, l.next);
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
