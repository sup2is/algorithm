
import java.util.*;

class Solution {
    public boolean isValid(String s) {
        
    
        if(s == null && s.equals("")){
            return true;
        }
        
        Stack<Character> stack = new Stack<>();
            
        for(int i = 0; i < s.length(); i ++) {
            
            if(stack.isEmpty()) {
                stack.push(s.charAt(i));
                continue;
            }
            
            if(s.charAt(i) == ')' && stack.peek() == '(') {
                stack.pop();
            }else if (s.charAt(i) == '}' && stack.peek() == '{') {
                stack.pop();
            }else if (s.charAt(i) == ']' && stack.peek() == '[') {
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }
    
        return stack.isEmpty();
        
    }
}
