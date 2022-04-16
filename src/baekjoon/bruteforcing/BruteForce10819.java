package baekjoon.bruteforcing;

import java.util.Arrays;
import java.util.Scanner;

public class BruteForce10819 {

    private static int n;
    private static int[] arr;
    private static int[] tmp;
    private static boolean[] visited;
    private static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        tmp = new int[n];
        visited = new boolean[n];

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        recursive(0);
        System.out.println(max);

    }

    private static void recursive(int count) {
        if (count == n) {
            int sum = 0;
            for (int i = 0; i < n-1; i++) {
                sum += Math.abs(tmp[i] - tmp[i+1]);
            }
            max = Math.max(sum, max);

            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                tmp[count] = arr[i];
                recursive(count+1);
                visited[i] = false;
            }
        }
    }
}
