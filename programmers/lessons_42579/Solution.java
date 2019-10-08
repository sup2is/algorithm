package lessons_42579;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class Solution {

	public int[] solution(String[] genres, int[] plays) {

		
		//key : genre , value : genre의 sum값
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		//최대힙구성
		PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {

				//재생횟수가 같지 않을경우 내림차순정렬
				if (o1[1] != o2[1]) {
					return Integer.compare(o2[1], o1[1]);
				} else {
					//재생횟수가 같을경우 index기반 오름차순정렬
					return Integer.compare(o1[0], o2[0]);
				}
			}
		});

		//genre별로 sum
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
			
			//map중 playCnt가 가장 큰것을 genre로 선택
			for (Entry<String, Integer> e : map.entrySet()) {
				if (playCnt < e.getValue()) {
					genre = e.getKey();
					playCnt = e.getValue();
				}
			}

			//plays에서 해당 genre가 같다면 play[j]의 index와 play횟수를 pq에 저장
			for (int j = 0; j < plays.length; j++) {
				if (genres[j].equals(genre)) {
					pq.add(new int[] { j, plays[j] });
				}
			}

			//2개를 초과하여 저장하지 않도록
			for (int j = 0; !pq.isEmpty() && j < 2; j++) {
				answerList.add(pq.poll()[0]);
			}
			//playCnt가 가장 큰 장르는 이미 pq에 저장했으므로 map에서 제거
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
