package baekjoon.greedy;

import java.util.*;

public class Greedy1783 {

    private static class Study implements Comparable<Study> {
        int start;
        int end;

        public Study(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Study o) {
            if (this.start == o.start) {
                return this.end - o.end;
            }
            return this.start - o.start;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Study> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int s = scanner.nextInt();
            int e = scanner.nextInt();

            list.add(new Study(s, e));
        }

        Collections.sort(list);

        Queue<Integer> queue = new PriorityQueue<>();

        for (Study study : list) {

            if (!queue.isEmpty() && queue.peek() <= study.start) {
                queue.poll();
            }
            queue.offer(study.end);
        }
        System.out.println(queue.size());
    }

}
