//maximum-binary-tree: https://leetcode.com/problems/maximum-binary-tree/ Complete

package maximum_binary_tree;

import java.util.Arrays;

class Solution {
    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode t = new TreeNode();
        recursive(t, nums);
        return t;
    }

    private static void recursive(TreeNode t, int[] nums) {
        int integerOfMaxValue = getIntegerOfMaxValue(nums);
        if(integerOfMaxValue < 0) return;

        t.val = nums[integerOfMaxValue];
        int[] left = Arrays.copyOfRange(nums, 0, integerOfMaxValue);
        int[] right = Arrays.copyOfRange(nums, integerOfMaxValue + 1, nums.length);

        if(left.length > 0) {
            t.left = new TreeNode();
            recursive(t.left, left);
        }

        if(right.length > 0) {
            t.right = new TreeNode();
            recursive(t.right, right);
        }

    }

    public static void main(String[] args) {
        constructMaximumBinaryTree(new int[] {3,2,1,6,0,5});
    }


    public static int getIntegerOfMaxValue(int[] arr) {
        int idx = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                idx = i;
                max = arr[i];
            }
        }
        return idx;
    }

}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}