package lessons_12921;

//https://programmers.co.kr/learn/courses/30/lessons/12921

public class Solution {

	public int solution(int n) {
		
		boolean[] p = new boolean[n+1];
		
		for (int i = 2; i < n; i++) {
			if(p[i] == false) {
				for (int j = i*2; j <= n; j+=i) {
					p[j] = true;
				}
			}
		}
		
		int cnt = 0;
		
		for (int i = 2; i < p.length; i++) {
			if(!p[i]) {
				cnt ++;
			}
		}
		
		return cnt;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(10));
	}

}
