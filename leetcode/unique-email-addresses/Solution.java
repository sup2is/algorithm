//unique-email-addresses: https://leetcode.com/problems/unique-email-addresses/ Complete

class Solution {
    public int numUniqueEmails(String[] emails) {
        var set = new HashSet<String>();
        for(String email : emails) {
            String local = email.substring(0, email.indexOf('@')).replace(".", "");
            if(local.contains("+")) {
                local = local.substring(0, local.indexOf('+'));
            }
            set.add(local + email.substring(email.indexOf('@')));
        }
        return set.size();
        
    }
}
