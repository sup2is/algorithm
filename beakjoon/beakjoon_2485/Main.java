package beakjoon_2485;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		int[] distance = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 0; i <= n - 2; i++) {
			distance[i] = arr[i + 1] - arr[i];
		}

		for (int i = 0; i <= n - 2; i++) {
			distance[i + 1] = gcd(distance[i], distance[i + 1]);
		}

		int interval = distance[n - 2];
		int streetTree = ((arr[n - 1] - arr[0])/ interval) - (arr.length - 1);
		System.out.println(streetTree);
	}

	private static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			return gcd(b, a % b);
		}
	}
}