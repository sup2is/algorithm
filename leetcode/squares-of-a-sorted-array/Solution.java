//squares-of-a-sorted-array: https://leetcode.com/problems/squares-of-a-sorted-array/ Complete

class Solution {
    public int[] sortedSquares(int[] A) {
        Queue<Integer> pq = new PriorityQueue<>();
        for(int a : A)
            pq.add(a * a);
        
        int[] arr = new int[pq.size()];
        for(int i = 0; i < arr.length; i ++)
            arr[i] = pq.poll();
        
        return arr;
    }
}
