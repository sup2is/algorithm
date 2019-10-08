package lessons_42579;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class Solution {

	public int[] solution(String[] genres, int[] plays) {

		
		//key : genre , value : genre�� sum��
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		//�ִ�������
		PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {

				//���Ƚ���� ���� ������� ������������
				if (o1[1] != o2[1]) {
					return Integer.compare(o2[1], o1[1]);
				} else {
					//���Ƚ���� ������� index��� ������������
					return Integer.compare(o1[0], o2[0]);
				}
			}
		});

		//genre���� sum
		for (int i = 0; i < genres.length; i++) {
			if (map.containsKey(genres[i])) {
				map.put(genres[i], map.get(genres[i]) + plays[i]);
			} else {
				map.put(genres[i], plays[i]);
			}
		}

		String genre = null;
		int playCnt = 0;

		ArrayList<Integer> answerList = new ArrayList<Integer>();
		
		while (!map.isEmpty()) {
			pq.clear();
			
			//map�� playCnt�� ���� ū���� genre�� ����
			for (Entry<String, Integer> e : map.entrySet()) {
				if (playCnt < e.getValue()) {
					genre = e.getKey();
					playCnt = e.getValue();
				}
			}

			//plays���� �ش� genre�� ���ٸ� play[j]�� index�� playȽ���� pq�� ����
			for (int j = 0; j < plays.length; j++) {
				if (genres[j].equals(genre)) {
					pq.add(new int[] { j, plays[j] });
				}
			}

			//2���� �ʰ��Ͽ� �������� �ʵ���
			for (int j = 0; !pq.isEmpty() && j < 2; j++) {
				answerList.add(pq.poll()[0]);
			}
			//playCnt�� ���� ū �帣�� �̹� pq�� ���������Ƿ� map���� ����
			map.remove(genre);
			playCnt = 0;
		}

		return answerList.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(
				Arrays.toString(
				solution.solution(new String[] { "classic", "pop", "classic", "classic", "pop" },
				new int[] { 1, 1, 1, 1, 1 })));
	}

}
