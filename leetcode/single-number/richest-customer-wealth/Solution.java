//richest-customer-wealth: https://leetcode.com/problems/richest-customer-wealth Complete

class Solution {
    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts).mapToInt(i -> Arrays.stream(i).sum()).max().getAsInt();
    }
}
