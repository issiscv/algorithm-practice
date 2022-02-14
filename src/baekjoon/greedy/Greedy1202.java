package baekjoon.greedy;

import java.util.*;

public class Greedy1202 {

    private static class Jewelry implements Comparable<Jewelry>{

        int weight;
        int price;

        public Jewelry(int weight, int price) {
            this.weight = weight;
            this.price = price;
        }

        @Override
        public int compareTo(Jewelry o) {
            return this.weight-o.weight;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();//보석 개수
        int K = scanner.nextInt();//가방 개수

        List<Jewelry> jewelries = new ArrayList<>();
        List<Integer> bags = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int M = scanner.nextInt();//보석 무게
            int V = scanner.nextInt();//보석 가격

            jewelries.add(new Jewelry(M, V));
        }

        for (int i = 0; i < K; i++) {
            int C = scanner.nextInt();//가방 무게

            bags.add(C);
        }

        Collections.sort(jewelries);
        Collections.sort(bags);

        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;
        int j = 0;

        for (int i = 0; i < K; i++) {

            while (j < N && jewelries.get(j).weight <= bags.get(i)) {
                queue.offer(jewelries.get(j).price);
                j++;
            }

            if (!queue.isEmpty())
                sum += queue.poll();
        }

        System.out.println(sum);
    }
}
