package beakjoon_2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());
		
		
		LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
		
		for (int i = 0; i < n; i++) {
			hashSet.add(Integer.parseInt(br.readLine()));
		}
		
		TreeSet<Integer> treeSet = new TreeSet<>(hashSet);

		for (Integer i : treeSet) {
			sb.append(i + "\n");
		}
		
		System.out.println(sb.toString());
	}
}
