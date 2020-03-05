package beakjoon_14916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if(n % 5 == 0) {
            System.out.println(n / 5);
            return;
        }

        int min = n / 5;
        int r = n - (5 * min);

        while (r % 2 != 0) {
            min --;
            r = n - (5 * min);
            if(min < 0) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(min + (r / 2));


    }
}