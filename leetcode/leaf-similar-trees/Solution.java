//leaf-similar-trees: https://leetcode.com/problems/leaf-similar-trees/ Complete

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
    
    static int cnt;
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        search(root1, queue);
        cnt = queue.size();
        validate(root2, queue);
        return cnt == 0 && queue.size() == 0;
    }
    
    
    public void search(TreeNode n, ArrayDeque<Integer> queue) {
        
        if(n.left == null && n.right == null) {
            queue.add(n.val);
            return;
        }
        
        if(n.left != null) {
            search(n.left, queue);
        }
        
        if(n.right != null) {
            search(n.right, queue);
        }
    }
    
    public void validate(TreeNode n, ArrayDeque<Integer> queue) {
                
        if(n.left == null && n.right == null) {
            if(!queue.isEmpty() && queue.peekFirst() == n.val) {
                queue.pollFirst();
            }
            cnt --;
            return;
        }
        
        if(n.left != null) {
            validate(n.left, queue);
        }
        
        if(n.right != null) {
            validate(n.right, queue);
        }
    }
}










