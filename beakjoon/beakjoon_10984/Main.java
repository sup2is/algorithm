package beakjoon_10984;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		while (t-- > 0) {
			int score = 0;
			double gscore = 0;
			
			int n = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				int c = Integer.parseInt(st.nextToken());
				double g = Double.parseDouble(st.nextToken());
				score += c;
				gscore += g * c;
			}
			
			System.out.println(score + " " + Math.round(gscore * 10/ score) / 10.0);
			
		}
	}
}