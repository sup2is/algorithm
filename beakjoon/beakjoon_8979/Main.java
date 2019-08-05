package beakjoon_8979;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][4];
		int rank = 0;
		
		int t[] = null;
		
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < 4; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		

		for (int i = 0; i < arr.length; i++) {
			if(arr[i][0] == k) {
				t = arr[i];
			}
		}
		
		//�ڽź��� �ݸ޴��� ���� ���� ī����
		for (int i = 0; i < arr.length; i++) {
			if(arr[i][1] > t[1]) {
				rank++;
			}
		}
		
		
		//�ڽŰ� �ݸ޴� ���� �����鼭 ���޴��� ���� ���� ī����
		for (int i = 0; i < arr.length; i++) {
			if(arr[i][1] == t[1] && arr[i][2] > t[2]) {
				rank++;
			}
		}
		
		//�ڽŰ� �ݸ޴� ���� �����鼭 ���޴� ���� ���� ���޴޼��� �������� ī����
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i][1] == t[1] && arr[i][2] == t[2] && arr[i][3] > t[3]) {
				rank++;
			}
		}
		
		System.out.println(++rank);
		
	}
}
