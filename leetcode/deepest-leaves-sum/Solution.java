//deepest-leaves-sum: https://leetcode.com/problems/deepest-leaves-sum/ Complete

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

    static int max;

    public int deepestLeavesSum(TreeNode root) {
        max = 0;
        getDeepest(root, 0);
        System.out.println(max);
        return getSum(root, 0);
    }

    private int getSum(TreeNode n, int i) {
        if(n == null) return 0;
        if(i == max - 1) return n.val;

        return getSum(n.left, i + 1) + getSum(n.right, i + 1);
    }

    private void getDeepest(TreeNode n, int i) {
        max = Math.max(max, i);
        if(n == null) return;
        getDeepest(n.left, i + 1);
        getDeepest(n.right, i + 1);
    }


}
