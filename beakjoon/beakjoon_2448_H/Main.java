package beakjoon_2448_H;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int line;
	static int limit;
	static int spaceCount;
	static int holeCount = 1;

	public static void main(String[] args) throws NumberFormatException, IOException {

		line = 2048;
		limit = line / 3;
		spaceCount = line;

		tree(1);

		bw.flush();
		bw.close();

	}

	public static void tree(int count) throws IOException {

		if (count % 3 == 0) {
			holeCount = count - 1;
		}

		String space = "";
		
		if (spaceCount > 3) {
			for (int i = 0; i < spaceCount - 3; i++) {
				space += " ";
			}
		}
		spaceCount = spaceCount - 3;

		for (int i = 0; i < count; i++) {
			if (i == 0) {
				bw.append(space);
			}
			bw.append("  *   ");
			
		}
		bw.append(space);
		bw.append("\n");

		for (int i = 0; i < count; i++) {
			if (i == 0) {
				bw.append(space);
			}
			bw.append(" * *  ");
		}
		bw.append(space);
		bw.append("\n");

		for (int i = 0; i < count; i++) {
			if (i == 0) {
				bw.append(space);
			}
			bw.append("***** ");

		}
		bw.append(space);
		bw.append("\n");

		if (limit == count) {
			return;
		}

		tree(++count);
	}

}
