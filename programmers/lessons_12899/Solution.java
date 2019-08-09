package lessons_12899;

public class Solution {

	public String solution(int n) {

		int[] arr = new int[] {4,1,2};
		
		StringBuffer sb = new StringBuffer();
		StringBuffer ans = new StringBuffer();
		int m;
		
		while(n != 0) {
			m = n % 3;
			sb.append(m);
			n /= 3;
			
			if(m == 0) {
				n--;
			}

			ans.append(arr[m]);
		}
		
		return ans.reverse().toString();
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(10));
	}

}
