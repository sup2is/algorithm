package lessons_12905;

public class Solution {

	public int solution(int[][] board) {

		int max = 0;
		
		int[][] arr = new int[board.length + 1][ board[0].length + 1];
		int min;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if(board[i][j] == 1) {
					min = Math.min(arr[i + 1][j], Math.min(arr[i][j], arr[i][j + 1]));
					arr[i + 1][j + 1] = board[i][j] + min;
					max = Math.max(max, board[i][j] + min);
				}
			}
		}
		
		return max * max;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(new int[][] {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}}));
//		System.out.println(solution.solution(new int[][] {{0,0,1,1},{1,1,1,1}}));
		System.out.println(solution.solution(new int[][] {{0,0,1,0},{0,0,0,0}}));
	}

}
