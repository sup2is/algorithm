package beakjoon_2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int[] sorted;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		sorted = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		mergeSort(arr, 0, arr.length - 1);

		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i] + "\n");
		}
		System.out.println(sb);
		
		
	}

	private static void mergeSort(int[] arr, int start, int end) {
		
		int middle;
		
		if(start < end) {
			middle = (start + end) / 2;
			mergeSort(arr, start, middle);
			mergeSort(arr, middle + 1, end);
			merge(arr, start, middle, end);
		}
		
	}

	private static void merge(int[] arr, int start, int middle, int end) {
		
		int s = start;
		int m = middle + 1;
		int k = start;
		
		while (s <= middle && m <= end) {
			if(arr[s] < arr[m]) {
				sorted[k++] = arr[s++];
			}else {
				sorted[k++] = arr[m++];
			}
		}
		
		while (s <= middle) {
			sorted[k++] = arr[s++];
		}
		while (m <= end) {
			sorted[k++] = arr[m++];
		}
		
		for (int i = start; i <= end; i++) {
			arr[i] = sorted[i];
		}
	}
}
