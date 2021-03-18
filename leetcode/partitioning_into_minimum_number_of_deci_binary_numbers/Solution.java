package partitioning_into_minimum_number_of_deci_binary_numbers;

class Solution {
    public int minPartitions(String n) {
        int max = 0;
        for (int i = 0; i < n.length(); i++) {
            max = Math.max(n.charAt(i) - 48, max);
        }
        return max;
    }
}