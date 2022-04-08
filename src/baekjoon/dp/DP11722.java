package baekjoon.dp;

import java.util.Arrays;
import java.util.Scanner;

public class DP11722 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N+1];
        int[] rdp = new int[N+1];

        for (int i = 1; i <= N; i++) {
            arr[i] = scanner.nextInt();
        }
        rdp[N] = 1;


        for (int i = N-1; i >= 1; i--) {
            for (int j = N; j >= i; j--) {
                if (arr[j] < arr[i]) {
                    rdp[i] = Math.max(rdp[i], rdp[j]);
                }
            }
            rdp[i] += 1;
        }

        System.out.println(Arrays.stream(rdp).max().getAsInt());
    }
}
