package beakjoon_4458;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        while (n-- > 0) {
            String s = br.readLine();
            sb.append(String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1) + "\n");
        }

        System.out.println(sb.toString());
    }
}