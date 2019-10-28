package lessons_42627;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

	public int solution(int[][] jobs) {

		int[] times = new int[jobs.length];
		int total = 0;
		
		Arrays.sort(jobs, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				
				
				if(o1[0] != o2[0]) {
					return Integer.compare(o1[0], o2[0]);
				}else {
					return Integer.compare(o1[1], o2[1]);
				}
				
			}
		});
		
		PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[1], o2[1]);
			}
		});
		

		int idx = 0;
		int timeIdx = 0;
		boolean isEmpty = false;
		
		while (idx < jobs.length || !pq.isEmpty()) {
			
			//pq가 비어있으면 작업상태가 비어있단걸로 간주하고 pq에 넣어줌
			if(pq.isEmpty()) {
				total += jobs[idx][0] - total;
				pq.add(jobs[idx++]);
				isEmpty = true;
			}
			
			//pq가 무조건 차있는 상태에서 가장 작업시간이 적은값을 뺌
			int[] temp = pq.poll();

			total += temp[1];
			
			if(isEmpty) {
				times[timeIdx ++] = temp[1];
			}else {
				times[timeIdx ++] = total - temp[0];
			}
			
			
			for (int i = idx; i < jobs.length; i++) {
				//요청시간이 total보다 작은것들만 들어와야함
				if(jobs[i][0] <= total) {
					pq.add(jobs[i]);
					idx ++;
				}
			}
			
			isEmpty = false;
		}
		
		int answer = 0;
		
		for (int i = 0; i < times.length; i++) {
			answer += times[i];
		}

		return answer / jobs.length;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(new int[][] {{0, 3}, {1, 9}, {2, 6}, {5 , 8}}));
//		System.out.println(solution.solution(new int[][] {{0, 3}, {1, 9}, {2, 6}}));
		System.out.println(solution.solution(new int[][] {{0, 3}, {5, 9}}));
//		System.out.println(solution.solution(new int[][] {{0, 3}, {1, 9},{500,6}}));
		System.out.println(solution.solution(new int[][] {{0, 9}, {0, 4}, {0, 5}, {0, 7}, {0, 3}}));
		
		
	}

}
