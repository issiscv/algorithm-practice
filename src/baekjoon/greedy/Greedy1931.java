package baekjoon.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Greedy1931 {

    private static class Conference implements Comparable<Conference> {
        int s;
        int e;

        public Conference(int s, int e) {
            this.s = s;
            this.e = e;
        }

        @Override
        public int compareTo(Conference o) {
            if (this.e == o.e) {
                return this.s - o.s;
            }
            return this.e - o.e;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Conference> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int s = scanner.nextInt();
            int e = scanner.nextInt();

            list.add(new Conference(s, e));
        }

        Collections.sort(list);
        int start = Integer.MIN_VALUE;
        int count = 0;

        for (Conference conference : list) {
            if (conference.s >= start) {
                start = conference.e;
                count++;
            }
        }
        System.out.println(count);
    }
}
