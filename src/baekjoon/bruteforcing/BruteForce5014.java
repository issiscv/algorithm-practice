package baekjoon.bruteforcing;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BruteForce5014 {

    private static int f;
    private static int s;
    private static int g;
    private static int u;
    private static int d;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        f = scanner.nextInt();//건물 높이 10
        s = scanner.nextInt();//현재 있는 층 1
        g = scanner.nextInt();//가야할 위치 10
        u = scanner.nextInt();//한번에 위로 올라가는 층수 2
        d = scanner.nextInt();//한번에 아래로 내려가는 층수 1

        //BFS

        BFS();

    }

    private static void BFS() {

        int[] command = new int[f+1];
        boolean[] visited = new boolean[f+1];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);
        visited[s] = true;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int now = queue.poll();

                if (now == g) {
                    System.out.println(command[now]);
                    return;
                }

                int upper = now + u;
                int under = now - d;

                if (upper <= f && !visited[upper]) {
                    command[upper] = command[now] + 1;
                    queue.offer(upper);
                    visited[upper] = true;
                }

                if (under >= 1 && !visited[under]) {
                    command[under] = command[now] + 1;
                    queue.offer(under);
                    visited[under] = true;
                }
            }
        }

        System.out.println("use the stairs");
    }
}
