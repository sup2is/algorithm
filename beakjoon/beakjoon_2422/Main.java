package beakjoon_2422;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<Integer>[] arr = new HashSet[n + 1];

        for (int i = 0; i <= n; i++) {
            arr[i] = new HashSet<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }

        int cnt = 0;

        for (int i = 1; i <= n - 2; i++) {
            for (int j = i + 1; j <= n; j++) {
                if(arr[i].contains(j)) continue;
                for (int k = j + 1; k <= n; k++) {
                    if(arr[i].contains(k)) continue;
                    if(arr[j].contains(k)) continue;
//                    System.out.println(i + "," + j + "," + k);
                    cnt ++;
                }
            }
        }

        System.out.println(cnt);

    }
}