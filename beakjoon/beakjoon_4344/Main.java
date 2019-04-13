package beakjoon_4344;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int caseCnt = Integer.parseInt(br.readLine());
		int stdntCnt,result ;
		int	[] array;
		double avg ;
		String[] strArray;
		
		for (int i = 0; i < caseCnt; i++) {
			avg=0;
			result =0;
			strArray =  br.readLine().split(" ");
			array = new int[strArray.length];
			
			for (int j = 0; j < array.length; j++) {
				array[j] = Integer.parseInt(strArray[j]);
			}
			
			stdntCnt = array[0];
			
			for (int j = 1; j < stdntCnt+1; j++) {
				avg += array[j];
			}
			
			avg = avg/stdntCnt;
			
			for (int j = 1; j < stdntCnt+1; j++) {
				if(avg < array[j]) {
					result = result+1;
				}
			}
			
			bw.append(String.format("%.3f", (double)result/stdntCnt*100) + "%\n");
		}
		bw.flush();
		bw.close();
	}
}
