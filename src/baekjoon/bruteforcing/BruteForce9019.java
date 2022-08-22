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

        String[] command = new String[10000];
        boolean[] visited = new boolean[10000];

        visited[a] = true;
        Arrays.fill(command, "");

        queue.offer(a);
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int tmp = queue.poll();

                if (tmp == b) {
                    System.out.println(command[tmp]);
                    return;
                }

                int D = (tmp * 2) % 10000;
                int S = tmp == 0 ? 9999 : tmp - 1;
                int L = tmp % 1000 * 10 + tmp / 1000;
                int R = tmp % 10 * 1000 + tmp / 10;

                if (!visited[D]) {
                    queue.offer(D);
                    visited[D] = true;
                    command[D] = command[tmp] + "D";
                }

                if (!visited[S]) {
                    queue.offer(S);
                    visited[S] = true;
                    command[S] = command[tmp] + "S";
                }

                if (!visited[L]) {
                    queue.offer(L);
                    visited[L] = true;
                    command[L] = command[tmp] + "L";
                }

                if (!visited[R]) {
                    queue.offer(R);
                    visited[R] = true;
                    command[R] = command[tmp] + "R";
                }
            }
        }
    }

}
