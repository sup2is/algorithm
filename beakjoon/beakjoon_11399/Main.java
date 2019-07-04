package beakjoon_11399;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);

		int t = 0;
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			t += arr[i];
			ans += t;
		}
		
		System.out.println(ans);
		
		
	}
	
}