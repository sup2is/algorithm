package lessons_64061;

import java.util.Stack;

public class Solution {

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < moves.length; i++) {

            int m = moves[i] - 1;

            for (int j = 0; j < board.length; j++) {

                if(board[j][m] == 0) {
                    continue;
                }

                if(!stack.isEmpty() && stack.peek() == board[j][m]) {
                    stack.pop();
                    answer += 2;
                    board[j][m] = 0;
                    break;
                }else {
                    stack.push(board[j][m]);
                    board[j][m] = 0;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(
            solution(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[]{1,5,3,5,1,2,1,4})
        );
    }
}
