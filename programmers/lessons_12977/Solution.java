package lessons_12977;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {

	public int solution(int[] nums) {
		
		Arrays.sort(nums);
		
		int max = 0;
		
		for (int i = nums.length - 1; i >= nums.length - 3; i --) {
			max += nums[i];
		}
		
		boolean[] prime = new boolean[max + 1];
		
		for (int i = 0; i < prime.length; i++) {
			prime[i] = true;
		}
		
		prime[0] = false;
		prime[1] = false;
		
		for (int i = 2; i < prime.length; i++) {
			
			if(prime[i]) {
				for (int j = i*2; j < prime.length; j += i) {
					prime[j] = false;
				}
			}
		}
		
		boolean[] visited = new boolean[nums.length];
		
		HashSet<Integer> set = new HashSet<Integer>();
		combination(nums, visited, 0, nums.length, 3 , prime, set);
		
		return set.size();
	}
	
	
	public void combination(int[] arr, boolean[] visited, int start, int n, int r,boolean[] prime, HashSet<Integer> set) {
	    if(r == 0) {
	    	add(arr, visited, n, prime, set);
	    } else {
	        for(int i=start; i<n; i++) {
	            visited[i] = true;
	            combination(arr, visited, i + 1, n, r - 1, prime, set);
	            visited[i] = false;
	        }
	    }
	}


	private void add(int[] arr, boolean[] visited, int n, boolean[] prime, HashSet<Integer> set) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if(visited[i]) {
				temp += arr[i];
			}
		}
		
		if(prime[temp]) {
			set.add(temp);
		}
		
	}
	

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(new int[] { 1,2,7,6,4 }));
	}

}
