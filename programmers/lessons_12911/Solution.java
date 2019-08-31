package lessons_12911;

public class Solution {

	public int solution(int n) {
		
		StringBuilder sb = new StringBuilder();
		
		while (n != 0) {
			sb.append(n % 2);
			n /= 2;
		}
		
		int[] arr = new int[sb.length() + 1];
		
		int cnt = 0;
		
		for (int i = 0; i < sb.length(); i++) {
			arr[i] = sb.charAt(i) - 48;
			if(arr[i] == 1) {
				cnt ++;
			}
		}
		
		int temp = 0;
		while(cnt != temp) {
			temp = 0;
			int idx = 0;
			
			while(arr[idx] != 0) {
				arr[idx++] = 0;
			}
			arr[idx] = 1;
			
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == 1) {
					temp ++;
				}
			}
		}
		
		int length = arr.length - 1;
		int answer = 0;
		
		for (int i = arr.length - 1; i >= 0; i--) {
			if(arr[i] == 1) {
				answer += Math.pow(2, length);
			}
			length --;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(15));
	}

}
