//number-of-students-doing-homework-at-a-given-time: https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/ Complete

class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        return (int)IntStream.range(0, startTime.length)
            .filter(i -> startTime[i] <= queryTime && endTime[i] >=queryTime)
            .count();
        
    }
}
