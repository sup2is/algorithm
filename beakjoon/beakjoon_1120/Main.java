package beakjoon_1120;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		int ans = Integer.MAX_VALUE;
		int min = Integer.MAX_VALUE;
		
		ArrayList<Character> temp = new ArrayList<>();
		char[] org = new char[b.length()];
		
		for (int i = 0; i < a.length(); i++) {
			temp.add(a.charAt(i));
		}
		
		for (int i = a.length(); i < b.length(); i++) {
			temp.add('0');
		}
		
		for (int i = 0; i < b.length(); i++) {
			org[i] = b.charAt(i);
		}
		

		for (int i = 0; i <= b.length() - a.length(); i++) {
			min = Math.min(ans, min);
			ans = 0;
			for (int j = 0; j < b.length(); j++) {
				if(temp.get(j) == '0') {
					continue;
				}
				if(org[j] != temp.get(j)) {
					ans ++;
				}
			}
			temp.add(0, '0');
		}
		min = Math.min(ans, min);
		System.out.println(min);
	}
	
}