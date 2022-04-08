package baekjoon.dp;

import java.util.Arrays;
import java.util.Scanner;

public class DP11054 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N+1];
        int[] ldp = new int[N+1];
        int[] rdp = new int[N+1];
        int[] result = new int[N+1];
        for (int i = 1; i <= N; i++) {
            arr[i] = scanner.nextInt();
        }

        ldp[1] = 1;
        rdp[N] = 1;

        for (int i = 2; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                if (arr[j] < arr[i]) {
                    ldp[i] = Math.max(ldp[i], ldp[j]);
                }
            }
            ldp[i] += 1;
        }

        for (int i = N-1; i >= 1; i--) {
            for (int j = N; j >= i; j--) {
                if (arr[j] < arr[i]) {
                    rdp[i] = Math.max(rdp[i], rdp[j]);
                }
            }
            rdp[i] += 1;
        }

        for (int i = 1; i <= N; i++) {
            result[i] = ldp[i] + rdp[i] - 1;
        }

        System.out.println(Arrays.stream(result).max().getAsInt());
    }
}