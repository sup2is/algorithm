package beakjoon_1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String s[] = br.readLine().split(" ");
		int a[] = new int[t];
		int cnt = 0;
		
		for (int i = 0; i < s.length; i++) {
			a[i] = Integer.parseInt(s[i]);
		}
		
		for (int i = 0; i < a.length; i++) {
			if(isPrime(a[i])) {
				cnt ++;
			}
		}
		System.out.println(cnt);
	}
	
	static boolean isPrime(int a) {
		if(a < 2) {
			return false;
		}
		
		for (int i = 2; i*i <= a; i++) {
			if(a % i == 0) {
				return false;
			}
		}
		return true;
	}
}
