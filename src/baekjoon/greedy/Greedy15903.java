package baekjoon.greedy;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Greedy15903 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Queue<Long> queue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            long tmp = scanner.nextLong();
            queue.offer(tmp);
        }

        for (int i = 0; i < m; i++) {
            long a = queue.poll();
            long b = queue.poll();

            queue.offer(a+b);
            queue.offer(a+b);
        }

        long sum = 0;

        for (Long l : queue) {
            sum += l;
        }

        System.out.println(sum);
    }

}
