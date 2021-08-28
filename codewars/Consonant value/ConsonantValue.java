//Consonant value: https://www.codewars.com/kata/59c633e7dcc4053512000073/train/java Complete

public class ConsonantValue {
    public static int solve(final String s) {

        int max = 0;
        int count = 0;

        for(int i = 0; i < s.length(); i ++) {
            if(isVocoid(s.charAt(i))) {
                max = Math.max(count, max);
                count = 0;
                continue;
            }
            count += s.charAt(i) - 'a' + 1;
        }
        return Math.max(count, max);
    }
    public static boolean isVocoid(char c) {
        return c == 'a'
                || c == 'e'
                || c == 'i'
                || c == 'o'
                || c == 'u';
    }

}
