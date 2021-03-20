//letter-tile-possibilities: https://leetcode.com/problems/letter-tile-possibilities/ Complete

package letter_tile_possibilities;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public static int numTilePossibilities(String tiles) {
        Set<String> set = new HashSet<>();
        boolean[] visited = new boolean[tiles.length()];
        char[] chars = tiles.toCharArray();
        for (int i = 0; i < tiles.length(); i++) {
            recursive(chars, i, 0,"", set, visited);
        }

        return set.size() - 1;
    }

    private static void recursive(char[] chars, int i, int r, String s, Set<String> set, boolean[] visited) {
        if(i < 0 || i > chars.length || r > chars.length) return;
        set.add(s);
        for (int j = 0; j < chars.length; j++) {
            if(!visited[j]) {
                visited[j] = true;
                recursive(chars, j, r + 1, s + chars[j], set, visited);
                visited[j] = false;
            }
        }
    }


    public static void main(String[] args) {
        System.out.println(numTilePossibilities("AAB"));
    }

}
