package lessons_42629;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
	
    public int solution(int stock, int[] dates, int[] supplies, int k) {
    	
    	PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
    	int idx = 0;
    	int answer = 0;
    	while (stock < k) {
    		
    		for (int i = idx; i < dates.length; i++) {
    			
    			//일 수 별로 자신이 공급받을 수 있는 날짜만 queue에 등록
    			if(dates[i] <= stock) {
    				priorityQueue.add(supplies[i]);
    				idx = i + 1;
    			}
    			
			}
    		stock += priorityQueue.poll();
			answer ++;
    		
		}
    	return answer;
    }
    
	public static void main(String[] args) {
		Solution solution = new Solution();
//		System.out.println(solution.solution(4, new int[] {1, 2, 3, 4}, new int[] {10, 40, 30, 20} , 100 ));
		System.out.println(solution.solution(4, new int[] {4, 10, 15}, new int[] {20, 5, 10} , 30 ));
	}

}
