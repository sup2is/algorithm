//merge-two-binary-trees: https://leetcode.com/problems/merge-two-binary-trees/ Complete

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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        
        if(t1 == null && t2 == null) {
            return null;
        }
    
        TreeNode root = new TreeNode((t1 != null ? t1.val : 0) + (t2 != null ? t2.val : 0));
        
        recursive(root, t1 != null ? t1.left : null, t1 != null ? t1.right : null);
        recursive(root, t2 != null ? t2.left : null, t2 != null ? t2.right : null);
        
        return root;
    }
    
    public void recursive(TreeNode n, TreeNode l, TreeNode r) {

        if(l != null) {
            if(n.left == null) {
                n.left = new TreeNode(l.val);
            } else {
                n.left.val += l.val;
            }
            recursive(n.left, l.left != null ? l.left : null, l.right != null ? l.right : null);
        }
        
    
        if(r != null) {
            if(n.right == null) {
                n.right = new TreeNode(r.val);
            } else {
                n.right.val += r.val;
            }
            recursive(n.right, r.left != null ? r.left : null, r.right != null ? r.right : null);
        }
        
    }
    
}
