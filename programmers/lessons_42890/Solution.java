package lessons_42890;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {

	static Set<String> set = new HashSet<>();
	static List<int[]> ans = new LinkedList<>();
	public int solution(String[][] relation) {

		int[] comArr = new int[relation[0].length];
		boolean[] visited = new boolean[relation[0].length];

		for (int i = 0; i < comArr.length; i++) {
			comArr[i] = i;
		}

		for (int i = 0; i < comArr.length; i ++) {
			recur(comArr, visited, 0, comArr.length, i + 1, relation);
		}

		return ans.size();
	}

	private static void recur(int[] arr, boolean[] visited, int start, int n, int r, String[][] relation) {
		if(r == 0) {
			check(arr, visited, n, relation);
			return;
		} else {
			for(int i = start; i < n; i++) {
				visited[i] = true;
				recur(arr, visited, i + 1, n, r - 1, relation);
				visited[i] = false;
			}
		}
	}

	private static void check(int[] arr, boolean[] visited, int n, String[][] relation) {
		String s = "";
		for(int i = 0; i < n; i++) {
			if(visited[i] == true) {
				s = s + arr[i];
			}
		}

		int[] temp = new int[s.length()];

		for (int i = 0; i < s.length(); i++) {
			temp[i] = s.charAt(i) - 48;
		}

		if(isCandidateKey(temp , relation) && !isDuplicateKey(temp)) {
			ans.add(temp);
		}
		set.clear();
	}

	// 중복키 검사 로직 : 02, 012 일때 02가 최소성을 갖기 때문에 어쩔 수 없이 배열 전체를 쪼개서
	private static boolean isDuplicateKey(int[] arr) {
		for (int[] t: ans) {
			int cnt = t.length;

			for (int i = 0; i < t.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if(t[i] == arr[j]) {
						cnt --;
						break;
					}
				}
			}

			if(cnt == 0) {
				return true;
			}
		}
		return false;
	}

	//후보키 검사로직
	private static boolean isCandidateKey(int[] arr, String[][] relation) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < relation.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				sb.append(relation[i][arr[j]]);
			}

			if(set.contains(sb.toString())) {
				return false;
			}else {
				set.add(sb.toString());
			}
			sb.setLength(0);
		}
		return true;
	}

	public static void main(String[] args) throws NumberFormatException {
		Solution solution = new Solution();
		System.out.println(solution.solution(new String[][] {{"100","ryan","music","2"}
															,{"200","apeach","math","2"}
															,{"300","tube","computer","3"}
															,{"400","con","computer","4"}
															,{"500","muzi","music","3"}
															,{"600","apeach","music","2"}}));

	}

}