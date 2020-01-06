package beakjoon_1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);

		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		StringBuilder sb = new StringBuilder();

		while (m --> 0) {
			int idx = Arrays.binarySearch(arr, Integer.parseInt(st.nextToken()));
			if(idx >= 0) {
				sb.append("1\n");
			}else {
				sb.append("0\n");
			}
		}

		System.out.println(sb.toString());
	}
}