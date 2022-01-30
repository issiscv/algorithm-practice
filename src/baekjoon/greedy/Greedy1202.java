package baekjoon.greedy;

import java.util.*;

public class Greedy1202 {

    private static class Jewelry implements Comparable<Jewelry> {

        int weight;
        int price;

        public Jewelry(int weight, int price) {
            this.weight = weight;
            this.price = price;
        }

        @Override
        public int compareTo(Jewelry o) {
            return this.weight - o.weight;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();//보석의 개수
        int K = scanner.nextInt();//가방의 개수

        List<Jewelry> jList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();

        //N 번 반복
        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();//보석 무게
            int b = scanner.nextInt();//보석 가격

            jList.add(new Jewelry(a, b));
        }

        for (int i = 0; i < K; i++) {
            int w = scanner.nextInt();
            bList.add(w);
        }
        Collections.sort(bList);
        Collections.sort(jList);

        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        int j = 0;
        long answer = 0;

        for (int i = 0; i < K; i++) {

            while (j < N && jList.get(j).weight <= bList.get(i)) {
                queue.offer(jList.get(j++).price);
            }

            if (!queue.isEmpty()) {
                answer += queue.poll();
            }
        }

        System.out.println(answer);
    }
}
