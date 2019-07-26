package beakjoon_2822;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] ans = new int[8][2];
		int sum = 0;
		int[] num = new int[5];
		int t = 0;
		
		for (int i = 0; i < 8; i++) {
			ans[i][0] = i + 1;
			ans[i][1] = Integer.parseInt(br.readLine());			
		}
		
		Arrays.sort(ans,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[1], o2[1]);
			}
		});
		
		
		for (int i = ans.length - 1; i > 2; i--) {
			sum += ans[i][1];
			num[t++] = ans[i][0];
		}
		
		Arrays.sort(num);
		
		System.out.println(sum);
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		
	}
}