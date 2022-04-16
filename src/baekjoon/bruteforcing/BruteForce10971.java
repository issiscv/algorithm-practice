package baekjoon.bruteforcing;

import java.util.Scanner;

public class BruteForce10971 {

    private static int min;
    private static boolean[] visited;
    private static int[][] arr;
    private static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        arr = new int[n][n];
        visited = new boolean[n];
        min = Integer.MAX_VALUE;

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

    private static void recursive(int start, int i, int count, int sum) {

        if (count == n && start == i) {
            min = Math.min(sum, min);
            return;
        }

        for (int j = 0; j < n; j++) {
            if (arr[i][j] != 0 && !visited[j]) {
                visited[j] = true;
                recursive(start, j, count+1, sum + arr[i][j]);
                visited[j] = false;
            }
        }

    }
}
