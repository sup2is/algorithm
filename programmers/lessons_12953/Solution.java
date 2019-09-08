package lessons_12953;

public class Solution {

	public int solution(int[] arr) {

		if(arr.length == 1) {
			return arr[0];
		}

		
		int answer = lcm(arr[0], arr[1]);
		
		for (int i = 2; i < arr.length; i++) {
			answer = lcm(answer, arr[i]);
		}
		
		return answer;
	}
	
	public int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
	
	public int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
	

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(new int[] {1,2,3}));
	}

}
