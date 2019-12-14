package beakjoon_11656;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});

		String s = br.readLine();

		for (int i = 0; i < s.length(); i ++) {
			pq.add(s.substring(i , s.length()));
		}

		StringBuilder sb = new StringBuilder();
		while (!pq.isEmpty()){
			sb.append(pq.poll() + "\n");
		}

		System.out.println(sb.toString());

	}

}
