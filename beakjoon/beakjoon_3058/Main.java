package beakjoon_3058;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        while (t-- > 0) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 7; i++) {
                list.add(Integer.valueOf(st.nextToken()));
            }

            list = list.stream()
                .filter(i -> i % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

            int sum = 0;

            for (Integer integer : list) {
                sum += integer;
            }

            System.out.println(sum + " " + list.get(0));
            list.clear();
        }
    }
}
