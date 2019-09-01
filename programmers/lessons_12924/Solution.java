package lessons_12924;

public class Solution {

	public int solution(int n) {
		int answer = 0;
		int t = 0;
		int sum = 0;
		while (t != n) {
			t ++;
			for (int i = t; sum <= n; i++) {
				sum += i;
				if(sum == n) {
					answer ++;
					break;
				}
			}
			sum = 0;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(15));
	}

}
