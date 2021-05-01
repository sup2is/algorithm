//maximum-ice-cream-bars: https://leetcode.com/problems/maximum-ice-cream-bars Complete

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        for(int i : costs) {
            pq.add(i);
        }
        
        int count = 0;
        
        while(!pq.isEmpty() && coins > 0) {
            
            if(pq.peek() <= coins) {
                coins -= pq.poll();
                count ++;
            } else {
                return count;  
            }
        }
        
        return count;
    }
}