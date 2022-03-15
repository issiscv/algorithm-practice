package baekjoon.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sort111651 {

    static class Point implements Comparable<Point>{
        int X;
        int Y;

        public Point(int x, int y) {
            X = x;
            Y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.Y == o.Y) {
                return this.X - o.X;
            }
            return this.Y - o.Y;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        List<Point> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            list.add(new Point(x, y));
        }

        Collections.sort(list);

        for (Point point : list) {
            System.out.println(point.X + " " + point.Y);
        }
    }
}
