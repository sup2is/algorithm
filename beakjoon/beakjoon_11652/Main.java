package beakjoon_11652;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	

	private static void merge(long[] arr) {
		long[] temp = new long[arr.length];
		mergeSort(arr, temp, 0, arr.length-1);
	}
	
	private static void mergeSort(long[] arr, long[] temp, int start, int end) {
		if(start < end) {
			int mid = (start+end) / 2;
			mergeSort(arr, temp, start, mid);
			mergeSort(arr, temp, mid+1, end);
			merge(arr,temp,start,mid,end);
		}
	}

	private static void merge(long[] arr, long[] temp, int start, int mid, int end) {
		
		for (int i = start; i <= end; i++) {
			temp[i] = arr[i];
		}

		int part1 = start;
		int part2 = mid+1;
		int index = start;
		
		while(part1 <= mid && part2 <= end) {
			if(temp[part1] <= temp[part2]) {
				arr[index] = temp[part1];
				part1 ++;
			}else {
				arr[index] = temp[part2];
				part2 ++;
			}
			index ++;
		}
		
		for (int i = 0; i <= mid - part1; i++) {
			arr[index + i] = temp[part1 + i];
		}
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		long[] arr = new long[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}
		
		merge(arr);

		long ans = arr[0];
		int ansc = 1;
		int cnt = 1;

		for (int i = 1; i < arr.length; i++) {
			if(arr[i-1] == arr[i]) {
				cnt ++;
			}else {
				cnt = 1;
			}
			
			if(ansc < cnt) {
				ansc = cnt;
				ans = arr[i];
			}
			
		}
		
		System.out.println(ans);
	}
}
