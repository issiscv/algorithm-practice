package baekjoon.bruteforcing;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BruteForce1697 {

    private static boolean[] visited = new boolean[100001];
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        if (N >= K)
            System.out.println(N-K);
        else {
            BFS(N, K);
            System.out.println(count);
        }
    }

    private static void BFS(int n, int k) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);

        while (!queue.isEmpty()) {

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int tmp = queue.poll();
                if (tmp == k) return;

                if (tmp - 1 >= 1 && tmp - 1 <= 100000 &&!visited[tmp-1]) {
                    int nx = tmp - 1;
                    if (nx >= 1 && nx <= 100001) {
                        if (nx == k) {
                            count++;
                            return;
                        }
                        queue.offer(nx);
                        visited[nx] = true;
                    }
                }

                if (tmp + 1 >= 1 && tmp + 1<= 100000 && !visited[tmp+1]) {
                    int nx = tmp + 1;
                    if (nx >= 1 && nx <= 100001) {
                        if (nx == k) {
                            count++;
                            return;
                        }
                        queue.offer(nx);
                        visited[nx] = true;
                    }
                }

                if (tmp * 2 >= 1 && tmp * 2<= 100000 && !visited[2 * tmp]) {
                    int nx = tmp * 2;
                    if (nx >= 1 && nx <= 100001) {
                        if (nx == k) {
                            count++;
                            return;
                        }
                        queue.offer(nx);
                        visited[nx] = true;
                    }
                }
            }
            count++;
        }
    }
}
