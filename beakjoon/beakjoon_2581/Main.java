package beakjoon_2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        boolean p[] = new boolean[10001];
        p[1] = true;
        
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 2; i < 10001; i++) {
            if(p[i] == false) {
                for (int j = i*2; j < 10001; j+=i) {
                    p[j] = true;
                }
            }
        }

        for (int i = m; i <= n; i++) {
            if(!p[i]) {
                min = Math.min(min, i);
                sum += i;
            }
        }

        if(sum != 0) {
            System.out.println(sum);
            System.out.println(min);
        }else {
            System.out.println(-1);
        }
    }
}
