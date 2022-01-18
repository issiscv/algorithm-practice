package basic_algorithm.section9_greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TwoConferenceRoom {

    private static class Point implements Comparable<Point> {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.y == o.y) {
                return this.x-o.x;
            }
            return this.y-o.y;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Point> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            list.add(new Point(x, y));
        }

        Collections.sort(list);

        System.out.println(solution(list));
    }

    private static int solution(List<Point> list) {
        Point tmp = list.get(0);//(2, 3)
        int answer = 1;
        for (Point point : list) {
            if (point.x >= tmp.y) {
                tmp = point;
                answer++;
            }
        }
        return answer;
    }

}
