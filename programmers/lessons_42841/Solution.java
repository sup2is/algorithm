package lessons_42841;

public class Solution {
	
    public int solution(int[][] baseball) {

    	int answer = 0;    	
    	String t;
    	String q;
    	
    	// 숫자가 최대 3개 && 중복을 허용하지 않기때문에 123은 baseball게임에서 올 수 있는 가장 작은 수, 987은 가장 큰 수
    	for (int i = 123; i <= 987; i++) {
    		t = i + "";
    		
    		//1~9 라는 숫자이므로 완전탐색에서 0이 들어갈경우 continue
    		if(t.charAt(0) == '0' || t.charAt(1) == '0' || t.charAt(2) == '0') {
    			continue;
    		}
    		
    		//baseball게임은 중복숫자를 허용하지 않음
    		if(t.charAt(0) == t.charAt(1) || t.charAt(0) == t.charAt(2) || t.charAt(1) == t.charAt(2)) {
    			continue;
    		}
    		
    		for (int j = 0; j < baseball.length; j++) {

    			int s = 0;
    			int b = 0;
    			q = baseball[j][0] + "";

    			
    			if(t.charAt(0) == q.charAt(0) ) s++;
    			if(t.charAt(1) == q.charAt(1) ) s++;
    			if(t.charAt(2) == q.charAt(2) ) s++;
    			
    			if(s != baseball[j][1]) {
    				break;
    			}
    			
    			if(t.charAt(0) == q.charAt(1) || t.charAt(0) == q.charAt(2)) b++;
    			if(t.charAt(1) == q.charAt(0) || t.charAt(1) == q.charAt(2)) b++;
    			if(t.charAt(2) == q.charAt(1) || t.charAt(2) == q.charAt(0)) b++;
    			
    			if(b != baseball[j][2]) {
    				break;
    			}
    			
    			//baseball 배열 내에 strike 조건과 ball 조건을 전부 만족하는 경우
    			if(j == baseball.length - 1) {
    				answer ++;
    			}
			}
		}
    	
        return answer;
    }
    
    
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(new int[][] {{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}}));
	}

}
