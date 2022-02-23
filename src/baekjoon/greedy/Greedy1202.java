package baekjoon.greedy;

import java.util.*;

public class Greedy1202 {

    static class Jewelry implements Comparable<Jewelry> {
        int M;
        int V;

        public Jewelry(int m, int v) {
            M = m;
            V = v;
        }

        @Override
        public int compareTo(Jewelry o) {
            return this.M - o.M;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        List<Jewelry> jewelries = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int m = scanner.nextInt();
            int v = scanner.nextInt();
            jewelries.add(new Jewelry(m, v));
        }

        for (int i = 0; i < K; i++) {
            int a = scanner.nextInt();
            list.add(a);
        }

        Collections.sort(jewelries);
        Collections.sort(list);

        int j = 0;
        long sum = 0;
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i : list) {
            for (;j < N && jewelries.get(j).M <= i; j++) {
                queue.offer(jewelries.get(j).V);
            }

            if (!queue.isEmpty())
                sum += queue.poll();
        }

        System.out.println(sum);
    }
}
