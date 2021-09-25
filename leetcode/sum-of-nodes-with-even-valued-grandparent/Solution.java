//sum-of-nodes-with-even-valued-grandparent: https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent Complete

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    static int sum;
    
    public int sumEvenGrandparent(TreeNode root) {
        sum = 0;
        sumEvenGrandparent(root, false);
        return sum;
    }
    
    public void sumEvenGrandparent(TreeNode n, boolean flag) {
        
        if(flag) {
            if(n.left != null) {
                sum += n.left.val;
            }
            
            if(n.right != null) {
                sum += n.right.val;
            }            
        }
        
        flag = false;
        
        if(n.val % 2 == 0) {
            flag = true;    
        }
        
        if(n.left != null) {
            sumEvenGrandparent(n.left, flag);
        }

        if(n.right != null) {
            sumEvenGrandparent(n.right, flag);
        }
    }
}
