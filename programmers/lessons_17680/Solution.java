package lessons_17680;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {

	public int solution(int cacheSize, String[] cities) {

		int time = 0;
		MyLinkedHashMap<String, Integer> LRUCache = new MyLinkedHashMap<>(100000, 0.75f, true, cacheSize);

		for (String city : cities) {
			if(LRUCache.containsKey(city.toUpperCase())){
				time += 1;
			}else {
				time += 5;
			}
			LRUCache.put(city.toUpperCase(), 0);
		}

		return time;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
//		System.out.println(solution.solution(3, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"})); //50
		System.out.println(solution.solution(3, new String[] {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"})); //21
		System.out.println(solution.solution(2, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"})); //60
//		System.out.println(solution.solution(5, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"})); //52
//		System.out.println(solution.solution(2, new String[] {"Jeju", "Pangyo", "NewYork", "newyork"})); //16
//		System.out.println(solution.solution(0, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"})); //25
//		System.out.println(solution.solution(1, new String[] {"Jeju"})); //5
//		System.out.println(solution.solution(1, new String[] {"Jeju", "Jeju"})); //6
		System.out.println(solution.solution(1, new String[] {"Jeju", "Jeju", "Jeju", "Jeju", "Jeju", "Jeju", "Jeju", "Jeju", "Jeju", "Jeju", "Jeju"})); //15
	}

}

class MyLinkedHashMap<K,V> extends LinkedHashMap<K, V> {

	private final int CACHE_SIZE;

	public MyLinkedHashMap (int initialCapacity, float loadFactor, boolean accessOrder, int cacheSize) {
		super(initialCapacity, loadFactor, accessOrder);
		this.CACHE_SIZE = cacheSize;
	}

	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return this.size() > CACHE_SIZE;
	}
}