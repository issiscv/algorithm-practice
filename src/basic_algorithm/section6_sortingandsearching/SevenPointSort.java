package basic_algorithm.section6_sortingandsearching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SevenPointSort {

    static class Point implements Comparable<Point>{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.x == o.x) return this.y - o.y;
            return this.x-o.x;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Point> list = new ArrayList<>();

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            list.add(new Point(x, y));
        }

        Collections.sort(list);

        for (Point point : list) {
            System.out.println(point.x + " " + point.y);
        }
    }
}
