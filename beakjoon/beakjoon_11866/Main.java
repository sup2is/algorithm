package beakjoon_11866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int idx = k - 1;
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		for (int i = 0; i < n; i++) {
			linkedList.add(i + 1);
		}
		
		StringBuilder sb = new StringBuilder();
		
		while (!linkedList.isEmpty()) {
			while (linkedList.size() <= idx) {
				idx = linkedList.size() - idx;
				if (idx < 0) {
					idx *= -1;
				}
			}
			sb.append(linkedList.remove(idx) + ", ");
			idx += k - 1;
		}
		System.out.println("<" + sb.toString().substring(0, sb.length() - 2) + ">");
	}
}