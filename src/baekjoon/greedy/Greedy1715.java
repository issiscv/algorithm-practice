package baekjoon.greedy;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Greedy1715 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Queue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            queue.offer(scanner.nextInt());
        }

        int sum = 0;
        while (queue.size() > 1) {

            int a = queue.poll();
            int b = queue.poll();
            sum += (a+b);
            queue.offer(a + b);
        }

        System.out.println(sum);
    }
}
