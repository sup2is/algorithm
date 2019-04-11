package lessons_42576;

import java.util.Arrays;

/**
 * 
 * @author Choi
 * url : https://programmers.co.kr/learn/courses/30/lessons/42576?language=java
 * 
 */

public class Solution{

    public String solution(String[] participant, String[] completion) {
    	
//    	정확성 50 효율성0
//    	ArrayList<String> list = new ArrayList<>(Arrays.asList(participant));
//    	
//    	for (String com : completion) {
//    		if(list.contains(com)) {
//    			list.remove(com);
//    		};
//		}
//        return list.get(0);
    	
    	Arrays.sort(participant);
    	Arrays.sort(completion);
    	String str = "";
    	
    	for (int i = 0; i < participant.length; i++) {
    		if(i + 1== participant.length) {
				return participant[i];
			}
			if(!participant[i].equals(completion[i])) {
				str = participant[i];
				break;
			}
		}
    	return str;
    }

	public static void main(String[] args) {
		
		String[] testCase1_participant = {"leo", "kiki", "eden"};
		String[] testCase1_completion = {"kiki", "eden"};
		
		String[] testCase2_participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] testCase2_completion = {"josipa", "filipa", "marina", "nikola"};
		
		String[] testCase3_participant = {"mislav", "stanko", "mislav", "ana"};
		String[] testCase3_completion = {"stanko", "ana", "mislav"};

		Solution solution = new Solution();
		//성공
		System.out.println(solution.solution(testCase1_participant, testCase1_completion));
		//성공
		System.out.println(solution.solution(testCase2_participant, testCase2_completion));
		//성공
		System.out.println(solution.solution(testCase3_participant, testCase3_completion));
	}
	
}
