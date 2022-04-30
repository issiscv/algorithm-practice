package baekjoon.dp;

import java.util.Scanner;

public class DP2193 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        long[] arr = new long[91];

        arr[1] = 1;
        arr[2] = 1;

        for (int i = 3; i <= N; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(arr[N]);
    }
}
