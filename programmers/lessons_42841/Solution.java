package lessons_42841;

public class Solution {
	
    public int solution(int[][] baseball) {

    	int answer = 0;    	
    	String t;
    	String q;
    	
    	// ���ڰ� �ִ� 3�� && �ߺ��� ������� �ʱ⶧���� 123�� baseball���ӿ��� �� �� �ִ� ���� ���� ��, 987�� ���� ū ��
    	for (int i = 123; i <= 987; i++) {
    		t = i + "";
    		
    		//1~9 ��� �����̹Ƿ� ����Ž������ 0�� ����� continue
    		if(t.charAt(0) == '0' || t.charAt(1) == '0' || t.charAt(2) == '0') {
    			continue;
    		}
    		
    		//baseball������ �ߺ����ڸ� ������� ����
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
    			
    			//baseball �迭 ���� strike ���ǰ� ball ������ ���� �����ϴ� ���
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
