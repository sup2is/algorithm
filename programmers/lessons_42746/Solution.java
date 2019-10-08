package lessons_42746;

import java.util.Arrays;

import java.util.Comparator;

public class Solution {
	
    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();

        Integer[] arr = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        
        Arrays.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				
				StringBuilder s1 = new StringBuilder();
				StringBuilder s2 = new StringBuilder();
				
				s1.append(String.valueOf(o1));
				s2.append(String.valueOf(o2));
				
				if(s1.length() == s2.length()) {
					return Integer.compare(o2, o1);
				}
				
				int more = Math.max(s1.length(), s2.length());
				
				int s1Idx = 0;
				int s2Idx = 0;
				
				for (int i = s1.length(); i <= more; i++) {
					s1.append(s1.toString().charAt(s1Idx++ % s1.length()));
				}
				
				for (int i = s2.length(); i <= more; i++) {
					s2.append(s2.toString().charAt(s2Idx++));
				}
				
				return Integer.compare(Integer.parseInt(s2.toString()), Integer.parseInt(s1.toString()));
			}
		});
        
        for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
		}
        
        return sb.toString().charAt(0) != '0' ? sb.toString() : "0";
    }
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(new int[] {3443,9999999}));
	}

}

