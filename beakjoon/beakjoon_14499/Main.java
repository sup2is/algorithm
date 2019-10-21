package beakjoon_14499;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		Dice dice = new Dice();
		
		st = new StringTokenizer(br.readLine());
		
		while (k-- > 0) {
			int d = Integer.parseInt(st.nextToken());
			
			switch (d) {
			case 1:
				if(x + 1 >= m) continue;
				x ++;
				dice.right();
				break;
			case 2:
				if(x - 1 < 0) continue;
				x --;
				dice.left();
				break;
			case 3:
				if(y - 1 < 0) continue;
				y --;
				dice.up();
				break;
			case 4:
				if(y + 1 >= n) continue;
				
				y ++;
				dice.down();
				break;
			}
			
			if(map[y][x] != 0) {
				dice.write(map[y][x]);
				map[y][x] = 0;
			}else {
				map[y][x] = dice.getFloor();
			}
			
			dice.print();
		}
	}
}

class Dice {
	
	int[] horizontal;
	int[] vertical;
	
	public Dice() {
		this.horizontal = new int[4];
		this.vertical = new int[4];
	}

	public void down() {
		int t = horizontal[3];
		for (int i = horizontal.length - 1; i > 0 ; i--) {
			horizontal[i] = horizontal[i - 1];
		}
		horizontal[0] = t;
		vertical[1] = horizontal[1];
		vertical[3] = horizontal[3];
	}
	public void up() {
		int t = horizontal[0];
		for (int i = 1; i < horizontal.length ; i++) {
			horizontal[i - 1] = horizontal[i];
		}
		horizontal[3] = t;
		vertical[1] = horizontal[1];
		vertical[3] = horizontal[3];
	}
	public void left() {
		int t = vertical[0];
		for (int i = 1; i < vertical.length ; i++) {
			vertical[i - 1] = vertical[i];
		}
		vertical[3] = t;
		horizontal[1] = vertical[1];
		horizontal[3] = vertical[3];
	}
	public void right() {
		int t = vertical[3];
		for (int i = vertical.length - 1; i > 0 ; i--) {
			vertical[i] = vertical[i - 1];
		}
		vertical[0] = t;
		horizontal[1] = vertical[1];
		horizontal[3] = vertical[3];
	}
	
	public void print() {
		System.out.println(horizontal[1]);
	}
	
	public void write(int t) {
		horizontal[3] = t;
		vertical[3] = t;
	}
	
	public int getFloor() {
		return horizontal[3]; 
	}
	
	@Override
	public String toString() {
		return Arrays.toString(horizontal) + " | " + Arrays.toString(vertical);
	}
	
}

