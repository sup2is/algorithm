//find-the-highest-altitude: https://leetcode.com/problems/find-the-highest-altitude/ Complete

package find_the_highest_altitude;

class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < gain.length; i ++) {
            sum += gain[i];
            max = Math.max(sum, max);
        }
        return max;
    }
}
