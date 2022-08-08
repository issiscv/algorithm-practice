package baekjoon.etc;

import javax.management.Query;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Etc1158 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (!queue.isEmpty()) {

            for (int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }
            int poll = queue.poll();

            if (queue.isEmpty()) {
                sb.append(poll + ">");
            } else {
                sb.append(poll + ", ");
            }
        }

        System.out.println(sb.toString());

    }
}
