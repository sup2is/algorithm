package beakjoon_1546;

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

		int a = Integer.parseInt(br.readLine());
		
		String[] strArray =  br.readLine().split(" ");
		
		double[] array = new double[a];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(strArray[i]);
		}
		
		Arrays.sort(array);
		
		double result = 0;
		double max = array[array.length-1];
		
		for (int i = 0; i < array.length; i++) {
			result += array[i]/max*100;
		}                                                                                                                                                                                                                                                                                                                                                                                                                                       
		
		bw.write(result/a+ "");
		bw.flush();
		bw.close();
	}
}
