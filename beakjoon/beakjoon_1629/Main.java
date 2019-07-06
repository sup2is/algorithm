package beakjoon_1629;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		System.out.println(f(a,b,c));
		
	}
	
	public static long f(int a, int b, int c) {
		if(b == 0) {
			return 1;
		}
		
		if(b % 2 == 0) {
			long t = f(a, b/2, c) % c;
			return t * t % c;
		}else {
			return f(a, b-1, c) * a % c;
		}
	}
	
}