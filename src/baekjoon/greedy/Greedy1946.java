package baekjoon.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Greedy1946 {

    static class Grade implements Comparable<Grade> {
        int a;
        int b;

        Grade(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Grade o) {
            if(this.a > o.a) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            ArrayList<Grade> list = new ArrayList<>();
            for (int j = 0; j < num; j++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                list.add(new Grade(a, b));
            }

            Collections.sort(list);
            int min = list.get(0).b;
            int count = 1;
            for (int j = 1; j < list.size(); j++) {

                if (list.get(j).b < min) {
                    min = list.get(j).b;
                    count++;
                }
            }
            System.out.println(count);

        }

    }
}
