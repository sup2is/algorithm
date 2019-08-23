package lessons_42584;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] prices) {
    	
        int[] answer = new int[prices.length];
        int j;
        int idx = prices.length;
        
        loop:for (int i = 0; i < answer.length; i++) {
        	idx--;
        	
        	int t = prices[i];
        	
        	for (j = i + 1; j < answer.length; j++) {
				
        		if(t > prices[j]) {
        			answer[i] = j - i;
        			continue loop;
        		}
        		
			}
        	
        	if(answer[i] == 0) {
        		answer[i] = idx;
        	}
        	
		}
        
        
        return answer;
    }
    
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(Arrays.toString(solution.solution(new int[] {1, 2, 3, 2, 3})));
	}

}
