package beakjoon_14889;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[][] map;
    static int min = Integer.MAX_VALUE;
    static int[] startTeams;
    static int[] linkTeams;
    static boolean[] startVisited;
    static boolean[] linkVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        startTeams = new int[n / 2];
        linkTeams = new int[n / 2];
        startVisited = new boolean[n / 2];
        linkVisited = new boolean[n / 2];

        map = new int[n + 1][n + 1];

        StringTokenizer st;
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        combination(arr, visited, 0, n, n/2);

        System.out.println(min);
    }


    private static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if(r == 0) {
            calc(arr, visited, n);
            return;
        } else {
            for(int i=start; i<n; i++) {
                visited[i] = true;
                combination(arr, visited, i + 1, n, r - 1);
                visited[i] = false;
            }
        }
    }

    private static void calc(int[] arr, boolean[] visited, int n) {

        int startIdx = 0;
        int linkIdx = 0;

        for(int i=0; i<n; i++) {
            if (visited[i]) {
                startTeams[startIdx ++] = arr[i];
            }
        }

        for(int i=0; i<n; i++) {
            if (!visited[i]) {
                linkTeams[linkIdx ++] = arr[i];
            }
        }

        int startScore = getScore(startTeams);
        int linkScore = getScore(linkTeams);

        min = Math.min(min, Math.abs(startScore - linkScore));
    }

    private static int getScore(int[] teams) {
        int score = 0;
        for (int i = 0; i < teams.length; i++) {
            for (int j = i + 1; j < teams.length; j++) {
                score += map[teams[i]][teams[j]] + map[teams[j]][teams[i]];
            }
        }
        return score;
    }

}