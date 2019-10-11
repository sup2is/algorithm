package beakjoon_2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int[] arr = new int[2];
		
		for (int i = 0; i < arr.length; i++) {
			sb.setLength(0);
			sb.append(st.nextToken());
			sb.reverse();
			arr[i] = Integer.parseInt(sb.toString());
		}
		System.out.println(arr[0] > arr[1] ? arr[0] : arr[1]);
	}
		
}