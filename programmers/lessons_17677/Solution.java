package lessons_17677;

import java.util.TreeMap;

public class Solution {

	public static int solution(String str1, String str2) {

		final int target = 65536;
		final int size = 2;
		int unionSize = 0;
		int intersectionSize = 0;
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();

		TreeMap<String, Integer> str1TreeMap = new TreeMap<>();
		TreeMap<String, Integer> str2TreeMap = new TreeMap<>();


		unionSize += split(size, str1, str1TreeMap);
		unionSize += split(size, str2, str2TreeMap);

		if(str1TreeMap.size() == 0 && str2TreeMap.size() == 0){
			return target;
		}else if(str1TreeMap.size() == 1 && str2TreeMap.size() == 1 && str2TreeMap.containsKey(str1TreeMap.firstKey())) {

			int min = Math.min(str1TreeMap.get(str1TreeMap.firstKey()), str2TreeMap.get(str2TreeMap.firstKey()));
			int max = Math.max(str1TreeMap.get(str1TreeMap.firstKey()), str2TreeMap.get(str2TreeMap.firstKey()));

			return calculate(max, min, target);
		}

		for (String t1 : str1TreeMap.keySet()){
			for (int i = 0; i < str1TreeMap.get(t1); i ++) {
				for (String t2 : str2TreeMap.keySet()){
					if(str2TreeMap.containsKey(t1) && str2TreeMap.get(t1) > 0) {
						intersectionSize ++;
						str2TreeMap.put(t1, str2TreeMap.get(t1) - 1);
						break;
					}
				}
			}
		}

		unionSize -= intersectionSize;
		return calculate(unionSize, intersectionSize, target);
	}

	private static int calculate(int unionSize, int intersectionSize, int target) {
		if(intersectionSize == 0) {
			return 0;
		}
		return (int) (((double)intersectionSize)/unionSize * target);
	}


	private static int split(int interval, String str, TreeMap<String, Integer> treeMap) {
		int cnt = 0;
		String temp;
		for (int i = 0; i < str.length() - 1; i ++) {
			temp = str.substring(i, interval);
			interval += 1;
			if(!validate(temp)){ continue;};

			cnt ++;
			if(treeMap.containsKey(temp)) {
				treeMap.put(temp, treeMap.get(temp) + 1);
			}else {
				treeMap.put(temp, 1);
			}
		}
		return cnt;
	}

	private static boolean validate(String temp) {
		for (int i = 0; i < temp.length(); i ++) {
			if(temp.charAt(i) < 'A' || temp.charAt(i) > 'Z') {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
//		System.out.println(Solution.solution("FRANCE" , "french"));
//		System.out.println(Solution.solution("handshake" , "shake hands"));
		System.out.println(Solution.solution("aa1+aa2" , "AAAA12"));
//		System.out.println(Solution.solution("E=M*C^2" , "e=m*c^2"));
//		System.out.println(Solution.solution("FRANCE" , "french"));

	}



}
