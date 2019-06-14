package beakjoon_1076;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] ar) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String stArr[] = new String[3];
		
		for (int i = 0; i < stArr.length; i++) {
			stArr[i] = br.readLine();
		}
		
		Ohm ohm1 = Ohm.valueOf(stArr[0].toUpperCase());
		Ohm ohm2 = Ohm.valueOf(stArr[1].toUpperCase());
		Ohm ohm3 = Ohm.valueOf(stArr[2].toUpperCase());
		
		System.out.println((Long.parseLong(ohm1.getValue() + ohm2.getValue())) * ohm3.multipleValue);
	}
	
	enum Ohm {
		BLACK("0" , 1),
		BROWN("1" , 10),
		RED("2" , 100),
		ORANGE("3" , 1000),
		YELLOW("4" , 10000),
		GREEN("5" , 100000),
		BLUE("6" , 1000000),
		VIOLET("7" , 10000000),
		GREY("8" , 100000000),
		WHITE("9" , 1000000000);
		
		String value;
		int multipleValue;
		
		Ohm (String value, int multipleValue) {
			this.value = value;
			this.multipleValue = multipleValue;
		}

		public String getValue() {
			return value;
		}

		public int getMultipleValue() {
			return multipleValue;
		}
		
	}
}