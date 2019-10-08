package lessons_42784;

import java.util.Arrays;

/**
 * 
 * 
 * @author CHS
 * url : https://programmers.co.kr/learn/courses/30/lessons/42748
 *
 */

public class Solution {
	
    public int[] solution(int[] array, int[][] commands) {
    	
    	int[] answer = new int[commands.length];
     	int[] temp = {};
     	int[] copyArray = {};
     	
     	for (int t = 0; t < commands.length; t++) {
     		temp = commands[t];
     		copyArray = Arrays.copyOfRange(array, temp[0]-1, temp[1]);
     		Arrays.sort(copyArray);
     		answer[t] = copyArray[temp[2]-1];
 		}
         return answer;
    }
	
	public static void main(String[] args) {

		int[] testCase1_array = {1, 5, 2, 6, 3, 7, 4};
		int[][] testCase1_commands = {{2, 5, 3,}, {4, 4, 1}, {1, 7, 3}};
		
		Solution solution = new Solution();
		
		System.out.println(Arrays.toString(solution.solution(testCase1_array, testCase1_commands)));
		
	}
	

}
