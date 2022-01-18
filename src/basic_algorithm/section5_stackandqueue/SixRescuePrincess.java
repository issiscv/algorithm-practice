package basic_algorithm.section5_stackandqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SixRescuePrincess {

    public static int getSolution(int n, int m) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        int answer = 1;

        while (!queue.isEmpty()) {
            for (int i = 1; i < m; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
            if (queue.size() == 1) answer = queue.poll();
        }
        //
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();


        System.out.println(getSolution(n, m));
    }
}
