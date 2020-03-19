package beakjoon_5397;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class Main {


    public static void main(String[] args) throws NumberFormatException, IOException {

        final char LEFT = '<';
        final char RIGHT = '>';
        final char DELETE = '-';

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        LinkedList<Character> list = new LinkedList<>();

        while (t-- > 0) {

            String s = br.readLine();
            int cursor = 0;

            for (int i = 0; i < s.length(); i++) {

                char c = s.charAt(i);

                if(c == LEFT) {
                    if(cursor > 0) {
                        cursor --;
                    }
                }else if (c == RIGHT) {
                    if(cursor < list.size()) {
                        cursor ++;
                    }
                }else if (c == DELETE){
                    if(cursor > 0) {
                        cursor --;
                        list.remove(cursor);
                    }
                }else {
                    list.add(cursor++, c);
                }

            }

            while (!list.isEmpty()) sb.append(list.poll());
            sb.append("\n");
        }

        System.out.println(sb);

    }
}