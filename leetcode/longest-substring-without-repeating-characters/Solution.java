package longest_substring_without_repeating_characters;

import java.util.LinkedList;

class Solution {
	
    public int lengthOfLongestSubstring(String s) {

    	if(s.length() == 0) {
    		return 0;
    	}
    	
    	int[][] isExist = new int[128][2];
    	int max = Integer.MIN_VALUE;
    	int cnt = 0;
    	int removeCnt = 0;
    	LinkedList<Character> list = new LinkedList<>();

    	for (int i = 0; i < s.length(); i++) {
    		char c = s.charAt(i);
    		System.out.println(c);
    		if(isExist[(int)c][0] == 1) {
    			max = Math.max(max, list.size());
    			cnt -= isExist[(int)c][1] + 1 - removeCnt;
    			while (!list.isEmpty() && list.size() - cnt > 0) {
    				isExist[(int)list.poll()][0] = 0;
    				removeCnt ++;
				}
    		}
    		isExist[(int)c][0] = 1;
    		isExist[(int)c][1] = i;
    		list.add(c);
    		cnt = list.size();
		}
		return Math.max(list.size(), max);
    }
    
    public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.lengthOfLongestSubstring("aabaab!bb")); // 3
		System.out.println(solution.lengthOfLongestSubstring("ggububgrfk"));
	}
    
}
