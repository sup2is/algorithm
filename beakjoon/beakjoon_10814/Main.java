package beakjoon_10814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	private static void merge(Object[][] arr) {
		Object[][] temp = new Object[arr.length][2];
		mergeSort(arr, temp, 0, arr.length-1);
	}
	
	private static void mergeSort(Object[][] arr, Object[][] temp, int start, int end) {
		if(start < end) {
			int mid = (start+end) / 2;
			mergeSort(arr, temp, start, mid);
			mergeSort(arr, temp, mid+1, end);
			merge(arr,temp,start,mid,end);
		}
	}

	private static void merge(Object[][] arr, Object[][] temp, int start, int mid, int end) {
		
		for (int i = start; i <= end; i++) {
			for (int j = 0; j < 2; j++) {
				temp[i][j] = arr[i][j];
			}
		}

		int part1 = start;
		int part2 = mid+1;
		int index = start;
		
		while(part1 <= mid && part2 <= end) {
			if(Integer.valueOf((String)temp[part1][0]) <= Integer.valueOf((String)temp[part2][0])) {
				arr[index][0] = temp[part1][0];
				arr[index][1] = temp[part1][1];
				part1 ++;
			}else {
				arr[index][0] = temp[part2][0];
				arr[index][1] = temp[part2][1];
				part2 ++;
			}
			index ++;
		}
		
		for (int i = 0; i <= mid - part1; i++) {
			arr[index + i][0] = temp[part1 + i][0];
			arr[index + i][1] = temp[part1 + i][1];
		}
		
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());
		Object[][] o = new Object[n][2];
		
		String[] s;
		for (int i = 0; i < n; i++) {
			s = br.readLine().split(" ");
			o[i][0] = s[0];
			o[i][1] = s[1];
		}
		merge(o);
		
		for (int i = 0; i < o.length; i++) {
			sb.append(o[i][0] + " " + o[i][1] + "\n");
		}
		
		System.out.println(sb.toString());
		
		
	}
}
