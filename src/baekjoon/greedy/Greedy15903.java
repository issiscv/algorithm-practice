package baekjoon.greedy;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Greedy15903 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();//3
        long m = scanner.nextLong();//1

        Queue<Long> queue = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            long tmp = scanner.nextLong();//3 2 6
            queue.offer(tmp);
        }

        for (int i = 0; i < m; i++) {
            long a = queue.poll();//2
            long b = queue.poll();//3
                queue.offer(a+b);
                queue.offer(a+b);
        }
        long sum = 0;
        for (long i : queue) {
            sum += i;
        }
        System.out.println(sum);
    }
}
