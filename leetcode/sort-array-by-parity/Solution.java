//sort-array-by-parity: https://leetcode.com/problems/sort-array-by-parity/ Complete

class Solution {
    public int[] sortArrayByParity(int[] A) {
        
        List<Integer> even = Arrays.stream(A)
            .filter(i -> i % 2 == 0)
            .boxed()
            .collect(Collectors.toList());
            
        List<Integer> odd = Arrays.stream(A)
            .filter(i -> i % 2 != 0)
            .boxed()
            .collect(Collectors.toList());

        even.addAll(odd);
        return even.stream().mapToInt(i->i).toArray();
    }
}
