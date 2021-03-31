//unique-morse-code-words: https://leetcode.com/problems/unique-morse-code-words/ Complete

package unique_morse_code_words;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public static int uniqueMorseRepresentations(String[] words) {
        String[] morse = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                sb.append(morse[words[i].charAt(j) - 'a']);
            }
            set.add(sb.toString());
            sb.setLength(0);
        }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }



}