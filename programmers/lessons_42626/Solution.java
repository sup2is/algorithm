package lessons_42626;

import java.util.PriorityQueue;

public class Solution {

    public int solution(int[] scoville, int k) {
    	
    	PriorityQueue<Integer> queue = new PriorityQueue<>();
    	for (Integer i : scoville) {
			queue.add(i);
		}
    	
    	int cnt = 0;
    	
    	while (queue.peek() <= k) {
    		
    		if(queue.peek() <= k && queue.size() == 1) {
    			return -1;
    		}
			
    		int t = queue.poll();
    		t = t + (queue.poll() * 2);
    		
    		queue.add(t);
    		cnt ++;
		}
    	
    	return cnt;
    }
    
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(new int[] {5, 2, 3, 9, 10, 12} , 7));
	}

}

