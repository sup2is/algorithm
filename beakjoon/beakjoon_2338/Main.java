package beakjoon_2338;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger b1 = new BigInteger(br.readLine(), 10);
        BigInteger b2 = new BigInteger(br.readLine(), 10);

        BigInteger addition = b1.add(b2);
        BigInteger subtraction = b1.subtract(b2);
        BigInteger multiply = b1.multiply(b2);

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiply);
    }
}