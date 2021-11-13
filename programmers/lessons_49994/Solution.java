//방문길이: https://programmers.co.kr/learn/courses/30/lessons/49994 Complete

import java.util.HashSet;
import java.util.Set;

class Solution {
    public static int solution(String dirs) {

        Set<Point> set = new HashSet<>();
        int[][] dir = new int[][] {
                {0, 1}, //R
                {0, -1}, //L
                {1, 0}, //U
                {-1, 0} //D
        };

        int x = 5;
        int y = 5;

        for (char c : dirs.toCharArray()) {

            int[] d = new int[0];

            if(c == 'R') {
                d = dir[0];
            }

            if(c == 'L') {
                d = dir[1];
            }

            if(c == 'U') {
                d = dir[2];
            }

            if(c == 'D') {
                d = dir[3];
            }

            if(x + d[1] < 0 || x + d[1] > 10 || y + d[0] < 0 || y + d[0] > 10) {
                continue;
            }

            int nextX = x + d[1];
            int nextY = y + d[0];

            Point point = new Point(x, y, nextX, nextY);

            System.out.println(point);

            boolean present = set.stream()
                    .filter(s ->
                            point.beforeX == s.nextX
                                    && point.beforeY == s.nextY
                                    && point.nextX == s.beforeX
                                    && point.nextY == s.beforeY
                    ).findAny().isPresent();

            if(!present) {
                set.add(point);
            }

            x = nextX;
            y = nextY;
        }

        return set.size();
    }

    public static void main(String[] args) {
        solution("LULLLLLLU");
    }

    static class Point {

        int beforeX;
        int beforeY;
        int nextX;
        int nextY;

        public Point(int beforeX, int beforeY, int nextX, int nextY) {
            this.beforeX = beforeX;
            this.beforeY = beforeY;
            this.nextX = nextX;
            this.nextY = nextY;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Point point = (Point) o;

            if (beforeX != point.beforeX) return false;
            if (beforeY != point.beforeY) return false;
            if (nextX != point.nextX) return false;
            return nextY == point.nextY;
        }

        @Override
        public int hashCode() {
            int result = beforeX;
            result = 31 * result + beforeY;
            result = 31 * result + nextX;
            result = 31 * result + nextY;
            return result;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "beforeX=" + beforeX +
                    ", beforeY=" + beforeY +
                    ", nextX=" + nextX +
                    ", nextY=" + nextY +
                    '}';
        }
    }
}
