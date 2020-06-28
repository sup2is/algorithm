package longest_common_prefix;

public class Solution {

    public static String longestCommonPrefix(String[] strs) {

        if(strs.length == 0) {
            return "";
        }

        int min = Integer.MAX_VALUE;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strs.length; i++) {
            min = Math.min(min, strs[i].length());
        }

        for (int i = 0; i < min; i++) {

            char c = strs[0].charAt(i);
            boolean flag = true;

            for (int j = 1; j < strs.length; j++) {
                if(strs[j].charAt(i) != c) {
                    flag = false;
                    break;
                }
            }

            if(!flag) {
                break;
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
//        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[]{}));

    }

}
