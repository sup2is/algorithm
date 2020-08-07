//subtract_the_product_and_sum_of_digits_of_an_integer: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/ Complete
package subtract_the_product_and_sum_of_digits_of_an_integer

class Solution {
    public int subtractProductAndSum(int n) {
        
        String s = String.valueOf(n);
        int sum = 0;
        int multi = 1;
        
        for(int i = 0; i < s.length(); i ++) {
            sum += s.charAt(i) - 48;
            multi *= s.charAt(i) - 48;
        }
        
        return multi - sum;
        
    }
}
