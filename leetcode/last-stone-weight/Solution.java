//last-stone-weight: https://leetcode.com/problems/last-stone-weight/ Complete

class Solution {
    public int lastStoneWeight(int[] stones) {
        
        var pq = new PriorityQueue<Integer>((x, y) -> Integer.compare(y, x));
        pq.addAll(Arrays.stream(stones)
                                    .boxed()
                                    .collect(Collectors.toList()));
        
        while(!pq.isEmpty() && pq.size() > 1) {
            int t = pq.poll() - pq.poll();
            if(t > 0) {
                pq.add(t);
            }
        }
        
        return pq.isEmpty() ? 0 : pq.poll();
    }
}
