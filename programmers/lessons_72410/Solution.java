//신규 아이디 추천: https://programmers.co.kr/learn/courses/30/lessons/72410 Complete

class Solution {
    public static String solution(String new_id) {
        new_id = new_id.toLowerCase()
                .replaceAll("[^a-z0-9\\-\\_\\.]", "")
                .replaceAll("\\.{2,}", ".");

        if(new_id.startsWith(".")) {
            new_id = new_id.substring(1);
        }

        if(new_id.endsWith(".")) {
            new_id = new_id.substring(0, new_id.length() - 1);
        }

        if(new_id.isEmpty()) {
            new_id = "a";
        }

        if(new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
        }

        if(new_id.endsWith(".")) {
            new_id = new_id.substring(0, new_id.length() - 1);
        }

        if(new_id.length() <= 2) {
            char c = new_id.charAt(new_id.length() - 1);
            for (int i = new_id.length(); i < 3; i++) {
                new_id += c;
            }
        }
        
        return new_id;
    }
}
