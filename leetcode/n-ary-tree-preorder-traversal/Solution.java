//n-ary-tree-preorder-traversal: https://leetcode.com/problems/n-ary-tree-preorder-traversal/ Complete

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        recur(root, list);
        return list;
    }
    
    public void recur(Node n, List<Integer> l) {
        if(n != null) {
            l.add(n.val);
                    
            for(Node c : n.children) {
                recur(c,l);
            }
        }

    }
}


