ckage frog_jmp;

public class Solution {

    public static int solution(int X, int Y, int D) {
        if(D == 1) return Y - X;

        int cnt = ((Y - 1) / D) + 1;
        if(X != 0) {
            if((Y - X) % D == 0) {
                cnt --;
            }
            cnt -= X / D;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(solution(10, 85 , 30));
        System.out.println(solution(10, 91 , 30));
        System.out.println(solution(0, 85 , 30));
        System.out.println(solution(25, 85 , 30));
        System.out.println(solution(55, 85 , 30));
        System.out.println(solution(54, 85 , 30));
        System.out.println(solution(1, 100 , 1));
    }

}


