package beakjoon_10817;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] s =  br.readLine().split(" ");
		
		int[] array = new int[3];
		
		array[0] = Integer.parseInt(s[0]);
		array[1] = Integer.parseInt(s[1]);
		array[2] = Integer.parseInt(s[2]);
		
		Arrays.sort(array);
		
		bw.write(array[1]+ "");
		bw.flush();
	}
}
