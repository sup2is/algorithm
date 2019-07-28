package lessons_42840;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
	
    public int[] solution(int[] answers) {
    	
    	final int[] idiot1_pattern = {1, 2, 3, 4, 5};
    	final int[] idiot2_pattern = {2, 1, 2, 3, 2, 4, 2, 5};
    	final int[] idiot3_pattern = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    	
    	int count1 = 0;
    	int count2 = 0;
    	int count3 = 0;
    	
    	for (int i = 0; i < answers.length; i++) {
			if(idiot1_pattern[i % idiot1_pattern.length] == answers[i]) {
				count1 += 1;
			}
			if(idiot2_pattern[i % idiot2_pattern.length] == answers[i]) {
				count2 += 1;
			}
			if(idiot3_pattern[i % idiot3_pattern.length] == answers[i]) {
				count3 += 1;
			}
		}
    	
    	int max = Math.max(count1, Math.max(count2, count3));
    	
    	ArrayList<Integer> result = new ArrayList<>();
    	
    	if(max == count1) {
    		result.add(1);
    	}
    	
    	if(max == count2) {
    		result.add(2);
    	}
    	
    	if(max == count3) {
    		result.add(3);
    	}
    	
    	Collections.sort(result);
    	
    	int[] arr = new int[result.size()];
    	
    	for (int i = 0; i < result.size(); i++) {
			arr[i] = result.get(i);
		}
    	
        return arr; 
    }
    
    
	public static void main(String[] args) {

		int[] testCase1_answers = {1, 2, 3, 4, 5};
		int[] testCase2_answers = {1, 3, 2, 4, 2};
		int[] testCase3_answers = {4, 4, 4, 5, 1};
		
		Solution solution = new Solution();
		
		System.out.println(Arrays.toString(solution.solution(testCase1_answers)));
		System.out.println(Arrays.toString(solution.solution(testCase2_answers)));
		System.out.println(Arrays.toString(solution.solution(testCase3_answers)));

	}

}
