package lessons_42842;

import java.util.Arrays;

public class Solution {

	public int[] solution(int brown, int red) {
		int w = 0;
		int h = 0;
		
		for (int i = 0; i <= 5000; i++) {
			w ++;
			h = 0;
			for (int j = 0; j < w; j++) {
				h ++;
				if(calc(w, h, brown, red)) {
					return new int[] {w,h};
				}
			}
		}
		return new int[] {0,0};
	}
	
	public boolean calc(int w, int h, int brown, int red) {
//		System.out.println("w : " + w);
//		System.out.println("h : " + h);
//		System.out.println("brown : " + brown);
//		System.out.println("red : " + red);
		if(w >= h && w * h == brown + red && (w * 2 + (h - 2) * 2) == brown) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(Arrays.toString(solution.solution(8, 1)));
		System.out.println(Arrays.toString(solution.solution(8, 2)));
		System.out.println(Arrays.toString(solution.solution(10, 2)));
		System.out.println(Arrays.toString(solution.solution(12, 4)));
		System.out.println(Arrays.toString(solution.solution(14, 6)));
		System.out.println(Arrays.toString(solution.solution(16, 8)));
		System.out.println(Arrays.toString(solution.solution(16, 9)));
		System.out.println(Arrays.toString(solution.solution(18, 12)));
		System.out.println(Arrays.toString(solution.solution(20, 16)));
		System.out.println(Arrays.toString(solution.solution(24, 24)));
		System.out.println(Arrays.toString(solution.solution(5000, 2000000)));
	}

}
