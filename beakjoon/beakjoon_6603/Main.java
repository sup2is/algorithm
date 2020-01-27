package beakjoon_6603;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr;
        boolean[] visited;
        int k;
        StringTokenizer st;
        while (true) {

            st = new StringTokenizer(br.readLine());

            k = Integer.parseInt(st.nextToken());

            if(k == 0) {
                return;
            }

            arr = new int[k];
            visited = new boolean[k];
            for (int i = 0; i < k; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            combination(arr, visited ,0, arr.length, 6);
            System.out.println();
        }
    }

    private static void combination(int[] arr, boolean[] visited , int start, int n, int r) {
        
        if(r == 0) {
            print(arr, visited);
        }else {
            for (int i = start; i < n; i++) {
                visited[i] = true;
                combination(arr, visited, i + 1, n, r - 1);
                visited[i] = false;
            }
        }
        
    }

    private static void print(int[] arr, boolean[] visited) {
        for (int i = 0; i < visited.length; i++) {
            if(visited[i]) {
                System.out.print(arr[i]+ " ");
            }
        }
        System.out.println();
    }
}