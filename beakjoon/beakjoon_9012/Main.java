package beakjoon_9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	private final String VPS = "()";

	public String recursiveVPS(String vpsStr) {
		if(!vpsStr.contains(VPS)) {
			return vpsStr;
		}
		vpsStr = vpsStr.replace(VPS, "");
		return recursiveVPS(vpsStr);
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		Main main = new Main();	
		
		int t = Integer.parseInt(bf.readLine());
		
		String vpsStr;
		
		for (int i = 0; i < t; i++) {
			if (i != 0) {
				sb.append("\n");
			}
			
			vpsStr = bf.readLine();
			vpsStr = main.recursiveVPS(vpsStr);
			if(vpsStr.length() > 0) {
				sb.append("NO");
			}else {
				sb.append("YES");
			}
			
		}
		System.out.print(sb.toString());
		System.out.println(sb.toString().equals("NO\r\n" + 
				"NO\r\n" + 
				"YES\r\n" + 
				"NO\r\n" + 
				"YES\r\n" + 
				"NO"));
	}
}
