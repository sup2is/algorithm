package beakjoon_2606;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		
		LinkedList<int[]> list = new LinkedList<int[]>();
		boolean[] visited = new boolean[n + 1];
		
		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			list.add(new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
		}
		
		Collections.sort(list, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[0], o2[0]);
			}
		});
		
		if(list.size() == 1 && list.get(0)[0] == 1) {
			System.out.println(1);
			return;
		}
		
		for (int i = 0; i < k; i++) {
			if(list.get(i)[0] == 1) {
				recursive(list,visited,list.get(i)[1]);
			}else if(list.get(i)[1] == 1) {
				recursive(list,visited,list.get(i)[0]);
			}else {
				break;
			}
		}
		
		int cnt = 0;
		
		for (int i = 2; i < visited.length; i++) {
			if(visited[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	private static void recursive(LinkedList<int[]> list, boolean[] visited, int i) {
		if(visited[i]) {
			return;
		}
		
		visited[i] = true;
		
		for (int j = 0; j < list.size(); j++) {
			if(i == list.get(j)[0]) {
				recursive(list, visited, list.get(j)[1]);
			}
			if(i == list.get(j)[1]) {
				recursive(list, visited, list.get(j)[0]);
			}
		}
	}
}
