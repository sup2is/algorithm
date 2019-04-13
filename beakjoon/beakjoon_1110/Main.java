package beakjoon_1110;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String value = "1";
		String temp = null;
		String[] numbers = null;
		int[] selfNum = new int[10000];
		int sum;
		for (int i = 1; i < 10000; i++) {
			sum = 0;
			
			if(Integer.parseInt(value) < 10) {
				temp = "0" + value;
			}else {
				temp = value;
			}
			
			numbers = temp.split("");
			
			for (int j = 0; j < numbers.length; j++) {
				sum = sum+Integer.parseInt(numbers[j]);
			}
			
			selfNum[i] = Integer.parseInt(value)+sum;
			value = (Integer.parseInt(value)+1)+"";
		}

		Arrays.sort(selfNum);
		
		for (int i = 0; i < selfNum.length; i++) {
			if(Arrays.binarySearch(selfNum, i) < 0) {
				bw.append(i + "\n");
			}
		}
		bw.flush();
		bw.close();
		
	}
}
