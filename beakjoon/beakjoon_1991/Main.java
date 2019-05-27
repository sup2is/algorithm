package beakjoon_1991;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
//	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuffer sb = new StringBuffer();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String s;
		
		int[][] arr = new int[n+1][2];
		int x;
		for (int i = 1; i <= n; i++) {
			s = br.readLine();
			x = s.charAt(0)-'A';
			
			if(s.charAt(2) != '.') {
				arr[x][0] = s.charAt(2) - 'A'; 
			}else {
				arr[x][0] = -1;
			}
			
			if(s.charAt(4) != '.') {
				arr[x][1] = s.charAt(4) - 'A';
			}else {
				arr[x][1] = -1;
			}
			
		}
		
		preOrder(arr,0);
		sb.append("\n");
		inOrder(arr,0);
		sb.append("\n");
		postOrder(arr,0);
		System.out.println(sb.toString());
	}

	private static void preOrder(int[][] arr, int x) throws IOException {
		if(x < 0) {
			return;
		}
		sb.append((char) (x + 'A'));
		preOrder(arr, arr[x][0]);
		preOrder(arr, arr[x][1]);
	}

	private static void inOrder(int[][] arr, int x) throws IOException {
		if(x < 0) {
			return;
		}
		inOrder(arr, arr[x][0]);
		sb.append((char) (x + 'A'));
		inOrder(arr, arr[x][1]);
	}
	
	private static void postOrder(int[][] arr, int x) throws IOException {
		if(x < 0) {
			return;
		}
		postOrder(arr, arr[x][0]);
		postOrder(arr, arr[x][1]);
		sb.append((char) (x + 'A'));
	}
}

