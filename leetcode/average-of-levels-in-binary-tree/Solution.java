//average-of-levels-in-binary-tree: https://leetcode.com/problems/average-of-levels-in-binary-tree/ Complete

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

    public List<Double> averageOfLevels(TreeNode root) {

        List<Integer> levels = new ArrayList<>();
        List<Double> answer = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        answer.add((double) root.val);
        levels.add(1);
        queue.add(new Node(root.left, 1));
        queue.add(new Node(root.right, 1));

        while (!queue.isEmpty()){
            Node n = queue.poll();

            if(n.treeNode != null) {
                if(n.depth >= answer.size()) {
                    answer.add((double) 0);
                    levels.add(0);
                }

                answer.set(n.depth, answer.get(n.depth) + n.treeNode.val);
                levels.set(n.depth, levels.get(n.depth) + 1);

                queue.add(new Node(n.treeNode.left, n.depth + 1));
                queue.add(new Node(n.treeNode.right, n.depth + 1));
            }
        }

        for (int i = 0; i < answer.size(); i++) {
            answer.set(i, answer.get(i) / levels.get(i));
            
        }
        return answer;
    }
    
    class Node {

        TreeNode treeNode;
        int depth;

        public Node(TreeNode treeNode, int depth) {
            this.treeNode = treeNode;
            this.depth = depth;
        }
    }
    
}
