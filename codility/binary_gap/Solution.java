//binary_gap: https://app.codility.com/programmers/lessons/1-iterations/ Complete

package binary_gap;

class Solution {

    public static int solution(int N) {
        char[] s = Integer.toBinaryString(N).toCharArray();
        int max = 0;
        int idx = 0;
        int cnt = 0;
        while (idx ++ < s.length - 1) {
            if(s[idx] == '1') {
                max = Math.max(max, cnt);
                cnt = 0;
            }else {
                cnt ++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(solution(1041));
    }

}

