//find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree: https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/ Complete


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    
    static TreeNode node;
    
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        recursive(cloned, target.val);
        return node;
    }
    
    public void recursive(TreeNode cloned, int targetVal) {
        
        if(cloned.val == targetVal) {
            node = cloned;
            return;
        }
        
        if(cloned.left != null) {
            recursive(cloned.left, targetVal);
        }
        
        if(cloned.right != null) {
            recursive(cloned.right, targetVal);
        }
        
    }
    
    
}