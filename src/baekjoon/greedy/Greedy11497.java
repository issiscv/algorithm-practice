package baekjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy11497 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int[] arr = new int[N];

            for (int j = 0; j < N; j++) {
                arr[j] = scanner.nextInt();
            }

            Arrays.sort(arr);

            int[] result = new int[N];

            int lt = 0;
            int rt = N - 1;
            for (int j = 0; j < N; j++) {
                if (j % 2 == 0) {
                    result[lt++] = arr[j];
                } else {
                    result[rt--] = arr[j];
                }
            }

            int max = Integer.MIN_VALUE;
            max = Math.abs(result[0] - result[N-1]);

            for (int j = 1; j < N; j++) {
                max = Math.max(max, Math.abs(result[j] - result[j-1]));
            }

            System.out.println(max);

        }
    }

}
