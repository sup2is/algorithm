package beakjoon_2529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	static List<String> list = new ArrayList<>();
	static boolean[] visited = new boolean[10];
	static String[] s;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		s = br.readLine().split(" ");

		for (int i = 0; i < 10; i ++) {
			visited[i] = true;
			recur(i, 0, i + "", n);
		}

		System.out.println(list.get(list.size() - 1));
		System.out.println(list.get(0));

	}


	private static void recur(int target, int sIdx, String ans, int n) {

		if(n + 1 == ans.length()) {
			list.add(ans);
		}else {
			for (int i = 0; i < 10; i ++) {
				if(!visited[i]) {
					if(s[sIdx].equals("<")) {
						if(target >= i) {
							continue;
						}
					}else {
						if(target <= i) {
							continue;
						}
					}
					visited[i] = true;
					recur(i, sIdx + 1, ans + i, n);
				}
			}
		}
		visited[target] = false;
	}
}
