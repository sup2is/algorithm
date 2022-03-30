//단어 변환: https://programmers.co.kr/learn/courses/30/lessons/43163

import java.util.*;

class Solution {

    static boolean[] visited;
    static List<Integer> answers;

    public static int solution(String begin, String target, String[] words) {

        visited = new boolean[words.length];
        answers = new ArrayList<>();

        HashSet<String> strs = new HashSet<>(Arrays.asList(words));

        if (!strs.contains(target)) {
            return 0;
        }

        for (int i = 0; i < begin.length(); i++) {
            recursive(begin, target, words, i, 0);
        }

        return answers.stream().sorted().findFirst().get();
    }

    private static void recursive(final String org, final String target, final String[] words, final int skipIdx, final int cnt) {

        if(org.equals(target)) {
            answers.add(cnt);
            return;
        }

        for (int k = 0; k < org.length(); k++) {
            loop:for (int i = 0; i < words.length; i++) {
                if(visited[i]) {
                    continue;
                }

                for (int j = 0; j < words[i].length(); j++) {
                    if(k == j) {
                        continue;
                    }

                    if(org.charAt(j) != words[i].charAt(j)) {
                        continue loop;
                    }
                }
                visited[i] = true;
                recursive(words[i], target, words, (skipIdx + 1) % 3, cnt + 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(
                solution("hit", "cog", new String[] {"hot", "dot", "dog", "lot", "log", "cog"})
        );
    }
}
