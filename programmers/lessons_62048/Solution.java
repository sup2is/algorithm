//멀쩡한 사각형: https://programmers.co.kr/learn/courses/30/lessons/62048 Complete


class Solution {
    public static long solution(int w,int h) {
        long v = ((long)w * (long)h);
        return v - (w + h - gcd(w, h));
    }

    public static long gcd(long a, long b) {
        if (a % b == 0) {
            return b;
        }
        else {
            return gcd(b, a % b);
        }
    }
    public static void main(String[] args) {
        long solution = solution(8, 12);
        System.out.println(solution);
    }
}

