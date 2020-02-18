package lessons_17679;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {

	public int solution(int m, int n, String[] board) {

		boolean[][] records = new boolean[m][n];
		char[][] map = new char[m][n];
		int totalCnt = 0;
		int before = -1;
		int cnt;

		for (int i = 0; i < m; i++) {
			map[i] = board[i].toCharArray();
		}

		while (totalCnt != before) {

			before = totalCnt;

			for (int i = 0; i < m - 1; i++) {
				for (int j = 0; j < n - 1; j++) {
					char target = map[i][j];
					if(target != '0' &&target == map[i][j + 1] && target == map[i + 1][j + 1] && target == map[i + 1][j]) {
						records[i][j] = true;
						records[i][j + 1] = true;
						records[i + 1][j + 1] = true;
						records[i + 1][j] = true;
					}
				}
			}

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if(records[i][j]) {
						totalCnt ++;
						records[i][j] = false;
						map[i][j] = '0';
					}
				}
			}

			for (int i = m - 1; i >= 0; i --) {
				for (int j = 0; j < n; j++) {
					if(map[i][j] == '0') {
						for (int k = i; k >= 0; k--) {
							if(map[k][j] != '0') {
								map[i][j] = map[k][j];
								map[k][j] = '0';
								break;
							}
						}
					}
				}
			}
		}

		return totalCnt;
	}


	public static void main(String[] args) throws NumberFormatException, IOException {
		Solution solution = new Solution();
		System.out.println(solution.solution(4 , 5 , new String[]{"CCBDE", "AAADE", "AAABF", "CCBBF"}));
	}


	private static void print(char[][] map) {
		for (int i = 0; i < map.length; i++) {
			System.out.println(Arrays.toString(map[i]));
		}
	}
}
