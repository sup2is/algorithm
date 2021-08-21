//The Supermarket Queue: https://www.codewars.com/kata/57b06f90e298a7b53d000a86/train/java Complete
//너무 개판으로 풀었음 ㅎ.. 

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Solution {

    public static int solveSuperMarketQueue(int[] customers, int n) {

        int time = 0;
        int min = Integer.MAX_VALUE;
        int[] arr = new int[n];

        LinkedList<Integer> queue = new LinkedList<>(Arrays.stream(customers)
                .boxed()
                .collect(Collectors.toList())
        );

        while (!queue.isEmpty()) {

            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == 0) {
                    if(queue.isEmpty()) {
                        break;
                    }
                    arr[i] = queue.pollFirst();
                }
            }

            if(queue.isEmpty()) {
                break;
            }

            for (int i = 0; i < arr.length; i++) {
                min = Math.min(min, arr[i]);
            }

            for (int i = 0; i < arr.length; i++) {
                arr[i] -= min;
            }
            time += min;
            min = Integer.MAX_VALUE;
        }

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        return time + max;
    }
    
}
