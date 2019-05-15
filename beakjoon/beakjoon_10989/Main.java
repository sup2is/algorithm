package beakjoon_10989;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[10001];

		for (int i = 0; i < n; i++) {
			arr[Integer.parseInt(br.readLine())] ++;	
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > 0) {
				for (int j = 0; j < arr[i]; j++) {
					bw.append(i + "\n");
				}
			}
		}
		bw.flush();
	}
}
