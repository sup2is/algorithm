package beakjoon_2292;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		
		int target = 1;
		
		int x = 2;
		int y = 1;

		int cnt = 1;
		
		while (target < n) {
			target += (x * 2) + (y * 2);
			cnt ++;
			
			x ++;
			y += 2;
		}
		
		System.out.println(cnt);
	}
}
