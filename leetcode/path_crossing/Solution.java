package path_crossing;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Solution {
    public static boolean isPathCrossing(String path) {

        Point point = new Point(0 , 0);
        Set<Point> set = new HashSet<>();

        set.add(point);

        for (int i = 0; i < path.length(); i++) {

            Point p = new Point(point.x , point.y);
            p.move(path.charAt(i));

            if(set.contains(p)) {
                return true;
            }else {
                set.add(p);
            }

            point = p;
        }

        return false;
    }

}

class Point{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(char d) {
        switch (d){
            case 'W':
                y --;
                break;
            case 'E':
                y ++;
                break;
            case 'N':
                x ++;
                break;
            case 'S':
                x --;
                break;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}