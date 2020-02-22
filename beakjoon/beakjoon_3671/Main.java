package beakjoon_3671;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static Set<Integer> set = new HashSet<>();
    static boolean[] p = new boolean[10000000];
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Arrays.fill(p, true);

        p[0] = false;
        p[1] = false;

        for (int i = 2; i < p.length; i++) {
            if(p[i]) {
                for (int j = i * 2; j < p.length; j += i) {
                    p[j] = false;
                }
            }
        }

        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            char[] arr = s.toCharArray();
            visited = new boolean[arr.length];
            for (int j = 1; j <= s.length(); j++) {
                combination(0, s.length(), j, "", arr);
            }
            System.out.println(set.size());
            set.clear();
        }


    }

    public static void combination(int start, int n, int r, String numbers, char[] arr) {

        if(r == 0 && !set.contains(Integer.parseInt(numbers)) && p[Integer.parseInt(numbers)]) {
            set.add(Integer.parseInt(numbers));
            return;
        }

        for (int i = start; i < n + start; i++) {
            if(!visited[i % n]) {
                visited[i % n] = true;
                combination(i % n, n, r - 1, numbers + arr[i % n], arr);
                visited[i % n] = false;
            }
        }
    }

}