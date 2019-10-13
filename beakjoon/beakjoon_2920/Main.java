package beakjoon_2920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int before = Integer.parseInt(st.nextToken());
		
		boolean reverse = before == 1 ? false : true;
		
		while (st.hasMoreElements()) {
			
			int current = Integer.parseInt(st.nextToken());
			
			if(before - current != 1 && reverse) {
				System.out.println("mixed");
				return;
			}
			
			if( current - before != 1 && !reverse) {
				System.out.println("mixed");
				return;
			}
			
			before = current;
			
		}
		System.out.println(before == 1 ? "descending" : "ascending");
	}

}