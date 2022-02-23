package baekjoon.greedy;

import java.util.*;

public class Greedy11000 {

    static class Conference implements Comparable<Conference>{
        int S;
        int T;

        public Conference(int s, int t) {
            S = s;
            T = t;
        }

        @Override
        public int compareTo(Conference o) {
            return this.S - o.S;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        List<Conference> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            list.add(new Conference(a, b));
        }

        Collections.sort(list);

        Queue<Integer> queue = new PriorityQueue<>();

        for (Conference c : list) {

            if (!queue.isEmpty() && queue.peek() <= c.S) {
                queue.poll();
            }

            queue.offer(c.T);
        }

        System.out.println(queue.size());
    }
}
