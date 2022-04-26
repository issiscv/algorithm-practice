package baekjoon.bruteforcing;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BruteForce9019 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        while (N-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            BFS(a, b);
        }
    }

    private static void BFS(int a, int b) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(a);

        boolean[] visited = new boolean[10000];
        String[] command = new String[10000];

        Arrays.fill(command, "");

        while (!queue.isEmpty() && !visited[b]) {

            int tmp = queue.poll();

            int D = (tmp * 2) % 10000;
            int S = tmp == 0 ? 9999 : tmp - 1;
            int L = (tmp % 1000) * 10 + tmp / 1000;
            int R = (tmp % 10) * 1000 + tmp / 10;

            if (!visited[D]) {
                visited[D] = true;
                command[D] = command[tmp] + "D";
                queue.offer(D);
            }

            if (!visited[S]) {
                visited[S] = true;
                command[S] = command[tmp] + "S";
                queue.offer(S);
            }

            if (!visited[L]) {
                visited[L] = true;
                command[L] = command[tmp] + "L";
                queue.offer(L);
            }

            if (!visited[R]) {
                visited[R] = true;
                command[R] = command[tmp] + "R";
                queue.offer(R);
            }
        }
        System.out.println(command[b]);
    }
}
