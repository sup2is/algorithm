//Sum of Digits / Digital Root: https://www.codewars.com/kata/541c8630095125aba6000c00/train/java Complete 

public class DRoot {
    public static int digital_root(int n) {
        if(n < 10) {
            return n;
        }
        String s = String.valueOf(n);
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += c - '0';
        }                                                     
        return digital_root(sum);
    }
}
