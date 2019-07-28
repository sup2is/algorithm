package lessons_42862;

public class Solution {
	
	public int solution(int n, int[] lost, int[] reserve) {
    	
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if(lost[i] == reserve[j]) {
					lost[i] = -1;
					reserve[j] = -1;
				}
			}
		}
		
		for (int i = 0; i < lost.length; i++) {
			if (lost[i] < 0) {
				continue;
			}
			
			for (int j = 0; j < reserve.length; j++) {
				
				if(lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
					lost[i] = -1;
					reserve[j] = -1;
					continue;
				}
			}
		}
		
		int cnt = 0;
		
		for (int i = 0; i < lost.length; i++) {
			if(lost[i] > 0) {
				cnt ++;
			}
		}
    	return n - cnt;
    }
	public static void main(String[] args) {

		int testCase1_n = 5;
		int[] testCase1_lost = {2,4};
		int[] testCase1_reserve = {1,3,5};
		
		int testCase2_n = 5;
		int[] testCase2_lost = {2,4};
		int[] testCase2_reserve = {3};
		
		
		int testCase3_n = 3;
		int[] testCase3_lost = {3};
		int[] testCase3_reserve = {1};

		int testCase4_n = 8;
		int[] testCase4_lost = {1,4,8};
		int[] testCase4_reserve = {2,7};
		
		int testCase5_n = 6;
		int[] testCase5_lost = {2,3};
		int[] testCase5_reserve = {1,4};
		
		int testCase6_n = 6;
		int[] testCase6_lost = {2,3};
		int[] testCase6_reserve = {1,4};
		
		int testCase7_n = 15;
		int[] testCase7_lost = {1,3,5,6,7,9,13};
		int[] testCase7_reserve = {2,8,10,11,12};
		
		int testCase8_n = 6;
		int[] testCase8_lost = {2,3};
		int[] testCase8_reserve = {1,4};
		
		int testCase9_n = 5;
		int[] testCase9_lost = {2,4};
		int[] testCase9_reserve = {1,2};

		Solution solution = new Solution();
		
//		System.out.println(solution.solution(testCase1_n, testCase1_lost, testCase1_reserve));
//		System.out.println(solution.solution(testCase2_n, testCase2_lost, testCase2_reserve));
		System.out.println(solution.solution(testCase3_n, testCase3_lost, testCase3_reserve));
//		System.out.println(solution.solution(testCase4_n, testCase4_lost, testCase4_reserve));
//		System.out.println(solution.solution(testCase5_n, testCase5_lost, testCase5_reserve));
//		System.out.println(solution.solution(testCase6_n, testCase6_lost, testCase6_reserve));
//		System.out.println(solution.solution(testCase7_n, testCase7_lost, testCase7_reserve));
//		System.out.println(solution.solution(testCase8_n, testCase8_lost, testCase8_reserve));
//		System.out.println(solution.solution(testCase9_n, testCase9_lost, testCase9_reserve));

	}

}
