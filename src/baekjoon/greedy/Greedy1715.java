package baekjoon.greedy;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Greedy1715 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long[] arr = new long[n];
        Queue<Long> queue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
            queue.offer(arr[i]);
        }
        long sum = 0;
        while (queue.size() > 1) {
            long a = queue.poll();//10 30
            long b = queue.poll();//20 40
            long tmp = a + b;//30 70
            sum += tmp;//30 + 70
            queue.offer(tmp);//30 40
        }

        System.out.println(sum);

    }
}
