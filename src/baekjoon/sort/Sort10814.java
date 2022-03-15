package baekjoon.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sort10814 {

    static class Point implements Comparable<Point>{
        int age;
        String name;

        public Point(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Point o) {
            return this.age - o.age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        List<Point> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int age = scanner.nextInt();
            String name = scanner.next();

            list.add(new Point(age, name));
        }

        Collections.sort(list);

        for (Point point : list) {
            System.out.println(point.age + " " + point.name);
        }
    }
}
