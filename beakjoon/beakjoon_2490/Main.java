package beakjoon_2490;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		
		int o;
		int t;
		for (int i = 0; i < 3; i++) {
			o = 0;
			for (int j = 0; j < 4; j++) {
				t = sc.nextInt();
				if(t == 0) {
					o ++;
				}
			}
			
			if(o == 0) {
				System.out.println("E");
			}else if(o == 1) {
				System.out.println("A");
			}else if (o == 2) {
				System.out.println("B");
			}else if (o == 3) {
				System.out.println("C");
			}else {
				System.out.println("D");
			}
			
		}
	}
}

