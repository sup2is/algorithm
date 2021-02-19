//binary-search-tree-to-greater-sum-tree: https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/ Complete

package binary_search_tree_to_greater_sum_tree;

class Solution {

    static int sum;

    public TreeNode bstToGst(TreeNode root) {
        sum = 0;
        TreeNode treeNode = new TreeNode();
        recursive(root, treeNode);
        return treeNode;
    }

    private void recursive(TreeNode n, TreeNode treeNode) {
        if(n == null) return;

        if(n.right != null) {
            treeNode.right = new TreeNode();
            recursive(n.right, treeNode.right);
        }

        sum += n.val;
        treeNode.val = sum;

        if(n.left != null) {
            treeNode.left = new TreeNode();
            recursive(n.left, treeNode.left);
        }

    }


}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
