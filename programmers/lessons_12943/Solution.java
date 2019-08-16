package lessons_12943;

public class Solution {

	public int solution(int num) {
		
		long n = num;
		
		int cnt = 0;
		while(n != 1) {
			cnt ++;
			
			if (cnt > 500) {
				return -1;
			}
			
			
			if(n % 2 != 0) {
				n *= 3;
				n ++;
				continue;
			}
			
			n /= 2;
		}
		return cnt;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(626331));
	}

}
