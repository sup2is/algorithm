//maximum-depth-of-binary-tree https://leetcode.com/problems/maximum-depth-of-binary-tree/ Complete

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
    
    int max = 0;
    
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        dfs(root, 1);
        return max;
    }
    
    public void dfs(TreeNode n, int depth){
        
        max = Math.max(depth, max);
        
        if(n.left != null) {
            dfs(n.left, depth + 1);
        }
        
        if(n.right != null) {
            dfs(n.right, depth + 1);
        }
    }
    
}
