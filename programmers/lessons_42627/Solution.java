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
			
			//pq�� ��������� �۾����°� ����ִܰɷ� �����ϰ� pq�� �־���
			if(pq.isEmpty()) {
				total += jobs[idx][0] - total;
				pq.add(jobs[idx++]);
				isEmpty = true;
			}
			
			//pq�� ������ ���ִ� ���¿��� ���� �۾��ð��� �������� ��
			int[] temp = pq.poll();

			total += temp[1];
			
			if(isEmpty) {
				times[timeIdx ++] = temp[1];
			}else {
				times[timeIdx ++] = total - temp[0];
			}
			
			
			for (int i = idx; i < jobs.length; i++) {
				//��û�ð��� total���� �����͵鸸 ���;���
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
