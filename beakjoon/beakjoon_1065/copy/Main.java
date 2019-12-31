package beakjoon_1065.copy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.sound.midi.Soundbank;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		PriorityQueue<Integer> reverseQ = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o2, o1);
			}
		});
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			pq.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			reverseQ.add(Integer.parseInt(st.nextToken()));
		}
		

		int sum = Stream.generate(pq::poll)
			.map(v -> v * reverseQ.poll())
			.reduce(0, Integer::sum);
		
		System.out.println(sum);
	}
}
