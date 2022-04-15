package baekjoon.bruteforcing;

import java.util.Scanner;

public class BruteForce10971 {

    private static boolean[] visited;
    private static int[][] arr;
    private static int min = Integer.MAX_VALUE;
    private static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        visited = new boolean[n];
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            recursive(i, i, 0, 0);
        }
        System.out.println(min);

    }

    private static void recursive(int start, int i, int cnt, int sum) {

        if (cnt == n && start == i) {
            min = Math.min(min, sum);
            return;
        }

        for (int j = 0; j < n; j++) {
            if (arr[i][j] != 0 && !visited[i]) {
                visited[i] = true;
                int tmp = arr[i][j];
                recursive(start, j, cnt +1, sum + tmp);
                visited[i] = false;
            }
        }
    }
}
