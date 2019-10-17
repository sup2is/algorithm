package beakjoon_1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		TreeSet<String> set = new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() != o2.length()) {
					return Integer.compare(o1.length(), o2.length());
				}else {
					return o1.compareTo(o2);
				}
			}
		});
		
		while (n-- > 0) {
			set.add(br.readLine());
		}
		
		while (!set.isEmpty()) {
			sb.append(set.pollFirst() + "\n");
		}
		
		System.out.println(sb);
		
	}

}
