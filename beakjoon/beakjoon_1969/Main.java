package beakjoon_1969;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr; //ATGC
		char[] dna = new char[] {'A', 'T', 'G', 'C'};
		String[] str = new String[n];

		for (int i = 0; i < n; i++) {
			str[i] = br.readLine();
		}
		StringBuilder sb = new StringBuilder();

		int ans = 0;

		for (int i = 0; i < m; i++) {
			arr = new int[4];
			for (int j = 0; j < n; j++) {
				if(str[j].charAt(i) == dna[0]) {
					arr[0] ++;
				}else if(str[j].charAt(i) == dna[1]) {
					arr[1] ++;
				}else if(str[j].charAt(i) == dna[2]) {
					arr[2] ++;
				}else {
					arr[3] ++;
				}
			}

			char t = 'A';
			int cnt = 0;
			for (int j = 0; j < arr.length; j++) {
				if(cnt < arr[j]) {
					cnt = arr[j];
					t = dna[j];
				}else if(cnt == arr[j]) {
					if(t > dna[j]) {
						t = dna[j];
					}
				}
			}
			ans += n - Math.max(arr[0] , Math.max(arr[1], Math.max(arr[2], arr[3])));
			sb.append(t);
		}

		System.out.println(sb.toString());
		System.out.println(ans);

	}
}