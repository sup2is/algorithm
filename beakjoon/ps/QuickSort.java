package ps;

import java.util.Arrays;

public class QuickSort {

	public static void quickSort(int[] arr, int start, int end) {
		
		System.out.println("start index is " + start);
		System.out.println("end index is " + end);
		
		int part2 = partision(arr, start, end);
		
		System.out.println("start(" + start + ") < part2 - 1(" + (part2 - 1) + ") result = " + (start < part2-1));
		if (start < part2 - 1) {
			quickSort(arr, start, part2 - 1);
		}
		
		System.out.println("part2(" + part2 + ") < end(" + end + ") result = " + (part2 < end));
		if(part2 < end) {
			quickSort(arr, part2, end);
		}
		
	}

	private static int partision(int[] arr, int start, int end) {
		int pivot = arr[(start + end)/2];
		System.out.println("start pivot index is "+ ((start + end)/2) + ", value is " + pivot);
		System.out.print("#before swap     ");
		System.out.println(Arrays.toString(arr));
		while(start <= end) {
			while (arr[start] < pivot) start++;
			while (arr[end] > pivot) end--;
			if(start <= end) {
				swap(arr, start, end);
				start++;
				end--;
			}
		}
		System.out.println("#end swap");
		System.out.println("end of pivot index : " + start);
		return start;
	}

	private static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		System.out.println(Arrays.toString(arr));
	}



	public static void main(String[] args) {

		int[] arr = new int[] { 5, 9, 6, 4, 7, 3, 1, 8, 2 };
		System.out.println(Arrays.toString(arr));

		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}

}
