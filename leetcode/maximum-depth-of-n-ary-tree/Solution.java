//maximum-depth-of-n-ary-tree: https://leetcode.com/problems/maximum-depth-of-n-ary-tree/ Complete

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    
    int max = 0;
    
    public int maxDepth(Node root) {
        if(root == null) return 0;
        dfs(root, 1);
        return max;
    }
    
    public void dfs(Node n, int d) {
        max = Math.max(max, d);
        if(n == null) return;
        for(Node c : n.children) {
            dfs(c, d + 1);
        }
    }
}
