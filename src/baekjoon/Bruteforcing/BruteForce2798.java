package baekjoon.Bruteforcing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BruteForce2798 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        Integer[] arr = new Integer[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {

            for (int j = i+1; j < N; j++) {

                for (int k = j+1; k < N; k++) {
                    int tmp = arr[i] + arr[j] + arr[k];
                    if (tmp <= M) {
                        max = Math.max(max, tmp);
                    }
                }
            }
        }
        System.out.println(max);

    }
}
