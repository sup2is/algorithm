package lessons_60058;

import java.io.IOException;
import java.util.Arrays;
import java.util.Stack;

public class Solution {

    static int left = 0;
    static Stack<Character> stack = new Stack<>();
    static String orgStr;

    public String solution(String p) {
        orgStr = p;
        return recur(p);
    }

    private String recur(String str) {
        if (str.equals("")) {
            return "";
        }
        String u = getBalancedBracket();
        String v = orgStr.substring(left);

        if (isCollect(u)) {
            return u + recur(v);
        } else {
            return "(" + recur(v) + ")" + reverse(u);
        }
    }

    private String reverse(String u) {
        u = u.substring(1, u.length() - 1);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < u.length(); i++) {
            if (u.charAt(i) == ')') {
                builder.append('(');
            } else {
                builder.append(')');
            }
        }
        return builder.toString();
    }


    private boolean isCollect(String str) {
        stack.clear();
        for (int i = 0; i < str.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(str.charAt(i));
                continue;
            }

            if (stack.peek() == '(' && str.charAt(i) == ')') {
                stack.pop();
            } else {
                stack.push(str.charAt(i));
            }
        }
        return stack.size() == 0 ? true : false;
    }

    private String getBalancedBracket() {

        int l = 0;
        int r = 0;
        int right = left;

        for (int i = left; i < orgStr.length(); i++) {
            if (orgStr.charAt(i) == '(') {
                r++;
            } else {
                l++;
            }
            right++;

            if (r == l && r > 0 && l > 0) {
                break;
            }
        }

        String balanced = orgStr.substring(left, right);
        left = right;
        return balanced;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        Solution solution = new Solution();

        System.out.println(solution.solution("(()())()"));
        System.out.println(solution.solution(")()()()("));
        System.out.println(solution.solution("()))((()"));
    }
}