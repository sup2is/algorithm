//search-in-a-binary-search-tree: https://leetcode.com/problems/search-in-a-binary-search-tree/ Complete

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
    public TreeNode searchBST(TreeNode root, int val) {
        
        if(root == null) {
            return null;
        }
        
        if(root.val == val) {
            return root;
        }
        
        TreeNode node = new TreeNode();
        recursive(root.left, val, node);
        recursive(root.right, val, node);
        
        return node.val == 0 ? null : node;
    }
    
    public void recursive(TreeNode og, int val, TreeNode sub) {
        
        if(og != null && og.val == val) {
            sub.val = og.val;
            sub.left = og.left;
            sub.right = og.right;
            return;
        }
        
        if(og != null && og.val != val) {
            recursive(og.left, val, sub);
            recursive(og.right, val, sub);
        }

    }
}

