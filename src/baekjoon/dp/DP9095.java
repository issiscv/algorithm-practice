package baekjoon.dp;

import java.util.Scanner;

public class DP9095 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            int[] arr = new int[11];
            arr[1] = 1;
            arr[2] = 2;
            arr[3] = 4;
            for (int i = 4; i <= N; i++) {
                arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
            }

            System.out.println(arr[N]);
        }
    }
}
