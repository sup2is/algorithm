package beakjoon_2352;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[n];
		int[] target = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		target[0] = arr[0];

		int targetIdx = 1;

		for (int i = 1; i < n; i++) {
			if(target[0] > arr[i]) {
				target[0] = arr[i];
			}else if(target[targetIdx - 1] < arr[i]) {
				target[targetIdx++] = arr[i];
			}else {
				int idx = Arrays.binarySearch(target, 0, targetIdx - 1, arr[i]);
				idx = (idx < 0) ? -idx -1 : idx;
				target[idx] = arr[i];
			}
		}
		System.out.println(targetIdx);
	}
}