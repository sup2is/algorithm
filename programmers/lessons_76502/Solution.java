//괄호회전하기: https://programmers.co.kr/learn/courses/30/lessons/76502 Complete

import java.util.Stack;

class Solution {

    static int count;

    public static int solution(String s) {
        count = 0;
        String newStr = s;

        for (int i = 0; i < s.length() - 1; i++) {
            check(newStr);
            newStr = newStr.substring(1) + newStr.charAt(0);
        }

        return count;
    }

    private static void check(final String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if(stack.isEmpty()) {
                stack.push(c);
                continue;
            }

            switch (c) {
                case ')' :
                    if(stack.peek() == '(') {
                        stack.pop();
                    }
                    continue;
                case ']' :
                    if(stack.peek() == '[') {
                        stack.pop();
                    }
                    continue;
                case '}' :
                    if(stack.peek() == '{') {
                        stack.pop();
                    }
                    continue;
            }
            stack.push(c);
        }

        if(stack.isEmpty()) {
            count ++;
        }

    }

}

