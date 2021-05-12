//find-center-of-star-graph: https://leetcode.com/problems/find-center-of-star-graph Complete

class Solution {
    public int findCenter(int[][] edges) {

        int[] arr = new int[edges.length + 2];

        for (int[] edge : edges) {
            arr[edge[0]] ++;
            arr[edge[1]] ++;
        }

        int answer = -1;

        for(int i = 1; i < arr.length; i ++) {
            if(arr[i] == edges.length) answer = i;
        }

        return answer;
    }
}