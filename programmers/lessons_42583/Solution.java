package lessons_42583;

import java.util.ArrayDeque;

public class Solution {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 1;
        int i = 1;
        int currentWeight = truck_weights[0];
        
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
       
        deque.add(truck_weights[0]);
        
        while(currentWeight != 0) {

        	answer ++;
        	if(deque.size() >= bridge_length) {
        		currentWeight -= deque.pop();
        	}

        	if(i <= truck_weights.length - 1 && currentWeight + truck_weights[i] <= weight) {
        		deque.add(truck_weights[i]);
        		currentWeight += truck_weights[i];
        		i ++;
        	}else {
        		deque.add(0);
        	}
        }
        
        return answer;
        
    }
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(100,100, new int[] {10}));
	}

}
