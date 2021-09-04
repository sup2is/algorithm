//int32 to IPv4: https://www.codewars.com/kata/52e88b39ffb6ac53a400022e/train/java Complete

public class Kata {
    public static String longToIP(long ip) {

        StringBuilder sb = new StringBuilder(Long.toBinaryString(ip));
        sb.reverse();

        for (int i = sb.length(); i < 32; i++) {
            sb.append("0");
        }

        sb.reverse();

        StringBuilder answer = new StringBuilder();

        for (int i = 1; i <= 4; i++) {
            answer.append(Integer.parseInt(sb.substring((i - 1) * 8, i * 8), 2) + ".");
        }

        answer.setLength(answer.length() - 1);
        return answer.toString();
    }
}
