package beakjoon_2935;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		int power;
		int[] stat = new int[8];
		
		while(t-- > 0) {
			
			power = 0;
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 8; i++) {
				stat[i] = Integer.parseInt(st.nextToken());
			}
			
			stat[0] = ((stat[0] + stat[4] > 1 ? stat[0] + stat[4] : 1) * 1);
			stat[1] = ((stat[1] + stat[5] > 1 ? stat[1] + stat[5] : 1) * 5) ;
			stat[2] = ((stat[2] + stat[6] > 0 ? stat[2] + stat[6] : 0) * 2);
			stat[3] = ((stat[3] + stat[7]) * 2);
			
			for (int i = 0; i < 4; i++) {
				power+= stat[i];
			}
			
			System.out.println(power);
		}
	}
}
