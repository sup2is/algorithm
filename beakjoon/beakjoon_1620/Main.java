import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            map.put(s , i + 1);
            arr[i] = s;
        }

        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if(isInteger(s)) {
                System.out.println(arr[Integer.parseInt(s) - 1]);
            }else {
                System.out.println(map.get(s));
            }
        }

    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
}

