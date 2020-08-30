//n-ary-tree-postorder-traversal: https://leetcode.com/problems/n-ary-tree-postorder-traversal/ Complete

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
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        recur(root, list);
        return list;
    }
    
    public void recur(Node n, List<Integer> l) {
        if(n != null) {
            for(Node c : n.children) {
                recur(c,l);
            }
            l.add(n.val);
        }

    }
}
