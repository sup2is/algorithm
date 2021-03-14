//maximum-nesting-depth-of-the-parentheses: https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/ Complete

class Solution {
    public int maxDepth(String s) {
        
        int cnt = 0;
        int max = 0;
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i ++) {
            if(s.charAt(i) == '(' || s.charAt(i) == ')') {
                
                if(stack.isEmpty()) {
                    stack.push(s.charAt(i));
                    max = Math.max(max, stack.size());
                    continue;
                }
             
                if(stack.peek() == '(' &&  s.charAt(i) == ')') {
                    stack.pop();
                }else {
                    stack.push(s.charAt(i));
                    max = Math.max(max, stack.size());
                }
                
            }
        }
        
        return max;
    }
}
