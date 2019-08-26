package lessons_42587;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

	public int solution(int[] priorities, int location) {
		
		ArrayList<int[]> list = new ArrayList<>();
		
		for (int i = 0; i < priorities.length; i++) {
			list.add(new int[] {priorities[i],i});
		}

		int cnt = 0;
		int idx = 0;
		
		loop:while(idx + 1 < list.size()) {
			for (int i = idx + 1; i < list.size(); i++) {
				if(list.get(idx)[0] < list.get(i)[0]) {
					list.add(list.get(idx));
					list.remove(idx);
					continue loop;
				}
			}
			
			cnt ++;
			if(list.get(idx)[1] == location) {
				return cnt;
			}
			idx ++;
		}
		
		return list.size();
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(new int[] {2, 1, 3, 2}, 3));
	}

}
