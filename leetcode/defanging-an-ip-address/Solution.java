//defanging-an-ip-address https://leetcode.com/problems/defanging-an-ip-address Complete

class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
