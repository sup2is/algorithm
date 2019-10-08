package lessons_42884;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

	public int solution(int[][] routes) {

		Arrays.sort(routes, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] != o2[0]) {
					return Integer.compare(o1[0], o2[0]);
				} else {
					return Integer.compare(o1[1], o2[1]);
				}
			}
		});

		int sum = 1;
		
		int[] range = routes[0];
		for (int i = 1; i < routes.length; i++) {
			int[] next = routes[i];
			
			System.out.println(i);
			System.out.println("sum : " + sum);
			System.out.println("range : " + range[0] + " " + range[1]);
			System.out.println("next : " + next[0] + " " + next[1]);
			
			
			//다음 출발지, 도착지가 현재 출발지, 도착지 안에 있을때
			//모두 안에 있을 경우 range를 다음출발지로 변경
			if(range[0] <= next[0] && next[0] <= range[1] && next[1] <= range[1]) {
				range[0] = next[0];
				range[1] = next[1];
				continue;
			}
			
			//다음 출발지가 현재 출발지, 도착지 안에 있을때
			if(range[0] <= next[0] && next[0] <= range[1]) {
				if(range[1] >= next[0]) {
					range[0] = next[0];
					continue;
				}
			}
			
			sum ++;
			range[0] = next[0];
			range[1] = next[1];
		}
		return sum;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
//		System.out.println(solution.solution(new int[][] { { -20, 15 }, { -14, -5 }, { -18, -13 }, { -5, -3 }}));
//		System.out.println(solution.solution(new int[][] {{-3,0},{-2,-1},{1,2}}));
//		System.out.println(solution.solution(new int[][] {{0,0}}));
//		System.out.println(solution.solution(new int[][] {{0,1}, {0,1}, {1,2}}));
//		System.out.println(solution.solution(new int[][] {{0,1}, {2,3}, {4,5},{6,7}}));
//		System.out.println(solution.solution(new int[][] { { -20, -15 }, { -20, -15 }, { -14, -5 }, { -18, -13 }, { -5, -3 }}));
//		System.out.println(solution.solution(new int[][] { { -20, -15 }, { -20, -15 }, { -14, -5 }, {1,3},{25,26}, { -18, -13 }, { -5, -3 }}));
		System.out.println(solution.solution(new int[][] { {3,65}, {1,70}, {6,15}, {16,27},{4,80}, { -18, -13 }, { -5, -3 }}));
		
		
	}

}
