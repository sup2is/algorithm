package excel_sheet_column_title;

public class Solution {

    static StringBuilder sb = new StringBuilder();
    static boolean flag = false;
    public static String convertToTitle(int n) {
        sb.setLength(0);
        recur(n);
        return sb.toString();
    }

    private static void recur(int n) {

        if(n != 26 && n % 26 == 0) {
            n --;
            flag = true;
        }

        if(n > 26){
            recur(n / 26);
            n -= (n / 26) * 26;
            if(flag) {
                n ++;
                flag = false;
            }
        }
        sb.append((char)(n % 27 + 64));

    }
}

