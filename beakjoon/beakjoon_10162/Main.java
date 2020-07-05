package beakjoon_10162;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int a, b, c;

        a = div(n, 300);
        n %= 300;
        b = div(n, 60);
        n %= 60;
        c = div(n, 10);
        n %= 10;

        if(n != 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(a + " " + b + " " + c);

    }

    private static int div(int n, int i) {
        return n / i ;
    }
}
