package beakjoon_10988;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		if(sb.length() % 2 != 0) {
			sb.deleteCharAt(sb.length()/2);
		}
		StringBuilder reverse = new StringBuilder(sb.substring(sb.length()/2 , sb.length()));
		reverse.reverse();
		System.out.println(sb.substring(0, sb.length() / 2).equals(reverse.toString()) ? 1 : 0);

	}
}
