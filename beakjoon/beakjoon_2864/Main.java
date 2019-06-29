package beakjoon_2864;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String a = st.nextToken();
		String b = st.nextToken();
		
		int max = Integer.parseInt(a.replace("5", "6")) + Integer.parseInt(b.replace("5", "6"));
		int min = Integer.parseInt(a.replace("6", "5")) + Integer.parseInt(b.replace("6", "5"));
	
		System.out.println(min + " " + max);
		
	}
}
