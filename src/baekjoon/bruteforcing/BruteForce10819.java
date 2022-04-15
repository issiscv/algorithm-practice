package baekjoon.bruteforcing;

import java.util.Arrays;
import java.util.Scanner;

public class BruteForce10819 {

    private static int[] arr;
    private static boolean[] visited;
    private static int[] tmp;
    private static int n;
    private static int result = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        arr = new int[n];
        tmp = new int[n];

        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        recursive(0);

        System.out.println(result);
    }

    private static void recursive(int count) {

        if (count == n) {
            int sum = 0;
            for (int i = 0; i < n-1; i++) {
                sum += Math.abs(tmp[i] - tmp[i+1]);
            }

            result = Math.max(result, sum);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                tmp[count] = arr[i];
                visited[i] = true;
                recursive(count+1);
                visited[i] = false;
            }
        }
    }
}
