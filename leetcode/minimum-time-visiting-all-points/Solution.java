//minimum-time-visiting-all-points: https://leetcode.com/problems/minimum-time-visiting-all-points/ Complete

package minimum_time_visiting_all_points;

class Solution {
    public static int minTimeToVisitAllPoints(int[][] points) {

        int answer = 0;
        int[] before = points[0];
        for (int i = 1; i < points.length; i++) {
            answer += Math.max(Math.abs(before[0] - points[i][0]), Math.abs(before[1] - points[i][1]));
            before = points[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(minTimeToVisitAllPoints(new int[][] {{1,1},{3,4},{-1,0}}));
    }
}