package beakjoon_1138;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {

			int l = Integer.parseInt(st.nextToken());

			for (int j = 0; j < n; j ++) {

				if(l == 0 && arr[j] == 0) {
					arr[j] = i + 1;
					break;
				}
				if(arr[j] == 0) {
					l --;
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i] + " ");
		}

		System.out.println(sb.toString());
	}
}

