//univalued-binary-tree https://leetcode.com/problems/univalued-binary-tree/ Complete

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
    public boolean isUnivalTree(TreeNode root) {
        Set<Integer> set = new HashSet<>();
        recur(root, set);
        
        return set.size() == 1;
    }
    
    public void recur(TreeNode n, Set<Integer> set) {
        set.add(n.val);
        
        if(n.left != null) {
            recur(n.left, set);
        }
        if(n.right != null) {
            recur(n.right, set);
        }
    }
}
