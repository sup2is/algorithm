package beakjoon_2108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	
	static int[] sorted;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		int[][] counting = new int[8002][2];
		int[] arr = new int[n];
		sorted = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		mergeSort(arr, 0, arr.length - 1);

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			counting[arr[i] + 4000][0] ++;
			counting[arr[i] + 4000][1] = arr[i];
		}
		
		Arrays.sort(counting, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1 != o2) {
					return Integer.compare(o2[0], o1[0]);
				}else {
					return Integer.compare(o1[1], o2[1]);
				}
			}
		});
		
		System.out.println(sum > 0 ? Math.round((double)sum / n) : -1 * (Math.round((double) Math.abs(sum) / n)));
		System.out.println(arr[n/2]);
		System.out.println(n > 1 ?  counting[0][0] == counting[1][0] ? counting[1][1] : counting[0][1] : counting[0][1]);
		System.out.println(n > 1 ? Math.abs(arr[0]) + arr[arr.length - 1] : 0);
		
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
