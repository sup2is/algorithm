package lessons_42578;

import java.util.Arrays;

public class Solution {

    public int solution(String[][] clothes) {

    	
    	String[][] category = new String[clothes.length][2];
    	
    	int idx = 0;
    	
    	for (int i = 0; i < category.length; i++) {
			category[i][1] = "0";
		}
    	
    	
    	loop:for (int i = 0; i < clothes.length; i++) {
    		for (int j = 0; j < category.length; j++) {
    			//분류가 있을때
    			if(category[j][0] != null && category[j][0].equals(clothes[i][1])) {
    				category[j][1] = Integer.parseInt(category[j][1]) + 1 + "";
    				continue loop;
    			}
			}
    		category[idx][0] = clothes[i][1];
    		category[idx++][1] = "1";
    	}
    	
		category = Arrays.copyOf(category, idx);
    	
		if(category.length == 1) {
			return clothes.length;
		}
		
    	int cnt = Integer.parseInt(category[0][1]) + 1;
    	
    	for (int i = 1; i < category.length; i++) {
    		cnt *= Integer.parseInt(category[i][1]) + 1;
		}
        
        return cnt - 1;
    }

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}));
	}

}
