package beakjoon_1945;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		int n;
		int[][] arr;
		while(t-- > 0) {
			n = Integer.parseInt(br.readLine());
			arr = new int[n][2];
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				
				for (int j = 0; j < 2; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			Arrays.sort(arr, new Comparator<int[]>() {

				@Override
				public int compare(int[] o1, int[] o2) {
					return Integer.compare(o1[0], o2[0]);
				}
			});
			
			int temp[] = arr[0];
			int ans = 1;
			for (int i = 1; i < n; i++) {
				if(!(temp[0] < arr[i][0] && temp[1] < arr[i][1])) {
					temp = arr[i];
					ans ++;
				}
			}
			System.out.println(ans);
		}
	}
	
}