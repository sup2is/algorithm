package shuffle_string;

public class Solution {

    public static String restoreString(String s, int[] indices) {
        char[] restoredChar = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            restoredChar[indices[i]] = s.charAt(i);
        }
        return String.valueOf(restoredChar);
    }

    public static void main(String[] args) {
        restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3});
    }
}
