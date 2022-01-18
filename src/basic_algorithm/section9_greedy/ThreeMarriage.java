package basic_algorithm.section9_greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ThreeMarriage {

    private static class Point implements Comparable<Point>{
        int time;
        char category;

        public Point(int time, char category) {
            this.time = time;
            this.category = category;
        }

        @Override
        public int compareTo(Point o) {
            if (this.time == o.time) {
                return this.category - o.category;
            }
            return this.time - o.time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);;

        List<Point> list = new ArrayList<>();
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            list.add(new Point(a, 's'));

            int b = scanner.nextInt();
            list.add(new Point(b, 'e'));
        }

        Collections.sort(list);

        int answer = Integer.MIN_VALUE;
        int count = 0;
        for (Point point : list) {
            if (point.category == 's') {
                count++;
            } else {
                count--;
            }
            answer = Math.max(answer, count);
        }
        System.out.println(answer);
    }
}
