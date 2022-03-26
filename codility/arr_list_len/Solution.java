// arr_list_len: https://app.codility.com/programmers/trainings/7/arr_list_len/start/ Complete

class Solution {
    public int solution(int[] A) {
        
        if(A.length == 1) {
            return 1;
        }

        int idx = 0;
        int cnt = 1;
        while(A[idx] != -1) {
            cnt ++;
            idx = A[idx];
        }

        return cnt;
    }
}
