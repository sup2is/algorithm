package beakjoon_1357;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String x = st.nextToken();
		String y = st.nextToken();

		System.out.println(rev(rev(x) + rev(y) + ""));
		
	}
	
	private static StringBuffer sb = new StringBuffer();
	
	public static int rev(String s) {
		sb.setLength(0);
		sb.append(s).reverse();
		return Integer.parseInt(sb.toString());
	}
}
