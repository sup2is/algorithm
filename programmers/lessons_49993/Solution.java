package lessons_49993;

import java.util.ArrayList;

public class Solution {

    public int solution(String skill, String[] skill_trees) {
    	
    	ArrayList<Character> list = new ArrayList<>();
    	int answer = 0;
    	
    	for (int i = 0; i < skill.length(); i++) {
    		list.add(skill.charAt(i));
		}
    	
    	String s;
    	loop:for (int i = 0; i < skill_trees.length; i++) {
    		int idx = 0;
			s = skill_trees[i];
			
			for (int j = 0; j < s.length(); j++) {
				if(list.contains(s.charAt(j))) {
					if(list.get(idx) == s.charAt(j)) {
						idx ++;
					}else {
						continue loop;
						
					}
				}
			}
			answer ++;
			
		}
        return answer;
    }

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"}));
	}

}
