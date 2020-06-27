package palindrome_number;

public class Solution {

    public static boolean isPalindrome(int x) {

        if(x < 0) {
            return false;
        }

        StringBuilder sb = new StringBuilder();
        StringBuilder reverse = new StringBuilder();
        sb.append(x);

        if(sb.length() % 2 != 0) {
            sb.delete(sb.length() / 2, sb.length() / 2 + 1);
        }

        reverse.append(sb.substring(sb.length() / 2)).reverse();
        return sb.substring(0, sb.length() / 2).equals(reverse.toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));

    }

}
