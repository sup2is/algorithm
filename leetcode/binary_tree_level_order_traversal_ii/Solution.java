package binary_tree_level_order_traversal_ii;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {

   static int treeHeight;
   List<List<Integer>> levelOrders = new ArrayList<>();

   public List<List<Integer>> levelOrderBottom(TreeNode root) {

      if(root != null) {
         for (int i = 0; i < treeHeight; i++) {
            levelOrders.add(new ArrayList<>());
         }
         dfs(root, 0);
      }
      
      List<List<Integer>> reverseLevelOrders = IntStream.range(0, levelOrders.size())
                  .mapToObj(i -> levelOrders.get((levelOrders.size() - 1) - i))
                  .collect(Collectors.toList());
      
      return reverseLevelOrders;
   }
   
    private void dfs(TreeNode node, int level) {
       if(node == null) {
          return;
       }
       
       if(levelOrders.size() == level) {
          levelOrders.add(new ArrayList<>());
       }
       
       levelOrders.get(level).add(node.val);
       
       dfs(node.left, level + 1);
       dfs(node.right, level + 1);
   }

   public static void main(String[] args) {

      Solution solution = new Solution();

//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(9);
//        root.right = new TreeNode(20);
//        root.left.left = null;
//        root.left.right = null;
//        root.right.left = new TreeNode(15);
//        root.right.right = new TreeNode(7);
      TreeNode root = new TreeNode(1);
      root.left = new TreeNode(2);
      root.right = null;
      root.left.left = new TreeNode(3);
      root.left.right = null;
      root.left.left.left = new TreeNode(4);
      root.left.left.right = null;
      root.left.left.left.left = new TreeNode(5);
      root.left.left.left.right = null;

      System.out.println(solution.levelOrderBottom(root));

   }

}

class TreeNode {
   int val;
   TreeNode left;
   TreeNode right;

   TreeNode(int x) {
      val = x;
   }
}