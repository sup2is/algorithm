package lessons_42889;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public int[] solution(int N, int[] stages) {

    	double[][] result = new double[N][2];
        
        for (int i = 0; i < result.length; i++) {
			result[i][0] = i + 1;
		}
        
        for (int i = 0; i < stages.length; i++) {
        	if(stages[i] <= N) {
        		result[stages[i] - 1][1] ++;
        	}
		}
        
        int orgSize = stages.length;
        
        for (int i = 0; i < result.length; i++) {
        	if(result[i][1] != 0) {
        		int t = (int) result[i][1];
        		result[i][1] = result[i][1] / orgSize;
        		orgSize -= t;
        	}else {
        		result[i][1] = 0;
        	}
		}
        
        Arrays.sort(result, new Comparator<double[]>() {

			@Override
			public int compare(double[] o1, double[] o2) {
				if(o1[1] != o2[1]) {
					return Double.compare(o2[1], o1[1]);
				}else {
					return Double.compare(o1[0], o2[0]);
				}
			}
		});
        
        int[] answer = new int[N];
        
        for (int i = 0; i < answer.length; i++) {
			answer[i] = (int) result[i][0];
		}
        
        return answer;
    }
    
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3}));
//		System.out.println(solution.solution(4, new int[]{4, 4, 4, 4, 4}));
	}

}
