package beakjoon_1158;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	static int convert (int idx) {
		idx *= -1;
		return idx;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		String str = bf.readLine();
		
		int n = Integer.parseInt(str.split(" ")[0]);
		int k = Integer.parseInt(str.split(" ")[1]);

		int idx = k - 1;
		List<Integer> list = new ArrayList<>();
		List<Integer> result = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}
		
		

		while (!list.isEmpty()) {
			
			while (list.size() <= idx) {
				if (idx < 0) {
					idx = Main.convert(idx);
				}
				idx = list.size() - idx;
				if (idx < 0) {
					idx = Main.convert(idx);
				}
			}
			result.add(list.get(idx));
			list.remove(idx);
			idx += k-1;
		}

		sb.append("<");
		
		for (int i = 0; i < result.size(); i++) {
			if(i == result.size() - 1) {
				sb.append(result.get(i));
			}else {
				sb.append(result.get(i) + ", ");
			}
		}
		
		sb.append(">");
		
		System.out.println(sb.toString().trim());
	}
}
