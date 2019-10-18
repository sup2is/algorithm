package add.two.numbers;

public class Solution {

   public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

      ListNode node = new ListNode(0);
      ListNode n = node;
      
      int value = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
      boolean over = false;
      
      if(value + node.val < 10) {
         node.val += value;
         over = false;
      }else {
         node.val = (node.val + value) % 10;
         over = true;
      }
      
      if(l1 != null) {
         l1 = l1.next;
      }
      if(l2 != null) {
         l2 = l2.next;
      }

      while (l1 != null || l2 != null) {
         
         value = 0;

         if(l1 != null) {
            value += l1.val;
            l1 = l1.next;
         }
         if(l2 != null) {
            value += l2.val;
            l2 = l2.next;
         }
         
         if(over) {
            value ++;
         }
         
         over = false;

         if(value > 9) {
            value %= 10;
            over = true;
         }
         
         node.next = new ListNode(value);
         node = node.next;
      }
      
      if(over) {
         node.next = new ListNode(1);
      }
      return n;
   }

   public static void main(String[] args) {
      Solution solution = new Solution();
//      ListNode l1 = new ListNode(2);
//      l1.next = new ListNode(4);
//      l1.next.next = new ListNode(3);
      
//      ListNode l2 = new ListNode(5);
//      l2.next = new ListNode(6);
//      l2.next.next = new ListNode(4);
      
//      ListNode l1 = new ListNode(5);
//      ListNode l2 = new ListNode(5);
      
//      ListNode l1 = new ListNode(1);
//      ListNode l2 = new ListNode(9);
//      l2.next = new ListNode(9);
      
      ListNode l1 = new ListNode(9);
      l1.next = new ListNode(1);
      l1.next.next = new ListNode(6);
      ListNode l2 = new ListNode(0);
      
      System.out.println(addTwoNumbers(l1,l2));
   }
   
}

class ListNode {
	int val;
	ListNode next;
	
	public ListNode(int x) {
		this.val = x;
	}
}

