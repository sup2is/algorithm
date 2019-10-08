package lessons_42860;

import java.util.Arrays;

public class Solution {

    public int solution(String name) {
    	
    	int[] count = new int[name.length()];
    	int sum = 0;
    	
    	for (int i = 0; i < name.length(); i++) {
    		int cnt = counting(name.charAt(i));
    		count[i] = cnt;
    		sum += cnt;
		}
    	
    	//오른쪽으로만 탐색
    	int tSum = sum;
    	int cnt1 = 0;
    	for (int i = 0; i < count.length; i++) {
    		tSum -= count[i];
    		if(tSum == 0) {
    			break;
    		}
    		cnt1 ++;
		}

    	//배열의 역순으로 탐색
    	tSum = sum - count[0];
    	int cnt2 = 0;
    	
    	for (int i = count.length - 1; i >= 0; i--) {
    		tSum -= count[i];
    		cnt2++;
    		if(tSum == 0) {
    			break;
    		}
    	}
    	
    	//중간에 방향을 바꿀때
    	int[] leftArr;
    	int[] rightArr;
    	
    	if(count.length % 2 == 0) {
    		leftArr = Arrays.copyOf(count, count.length/2);
    		rightArr = Arrays.copyOfRange(count, count.length/2 , count.length);
    	}else {
    		leftArr = Arrays.copyOf(count, (count.length/2) + 1);
    		rightArr = Arrays.copyOfRange(count, (count.length/2) + 1 , count.length);
    	}
    	
    	int leftSum = 0;
    	int rightSum = 0;
    	
    	for (int i = 0; i < leftArr.length; i++) {
    		leftSum += leftArr[i];
		}
    	for (int i = 0; i < rightArr.length; i++) {
    		rightSum += rightArr[i];
    	}

    	int cnt3 = 0;
    	for (int i = 0; i < leftArr.length; i++) {
    		leftSum -= leftArr[i];
    		if(leftSum == 0) {
    			cnt3 += i;
    			break;
    		}
    		cnt3 ++;
		}
    	
    	for (int i = rightArr.length - 1; i >= 0; i--) {
    		rightSum -= rightArr[i];
    		cnt3++;
    		if(rightSum == 0) {
    			break;
    		}
    	}
    	
        return Math.min(cnt1, Math.min(cnt2, cnt3)) + sum;
    }
    
    public int counting(char c) {
    	
    	//A ~ M
    	if(c < 'N') {
    		return c - 65;
    	//O ~ Z	
    	}else if(c > 'N') {
    		return (c - 91)* -1;
    	}else {
    		return 13;
    	}
    	
    }

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("BBAAAAAAB"));
	}

}
