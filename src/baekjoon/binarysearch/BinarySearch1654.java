package baekjoon.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch1654 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int N = scanner.nextInt();

        long[] arr = new long[K];

        for (int i = 0; i < K; i++) {
            arr[i] = scanner.nextInt();
        }

        long lt = 0;
        long rt = Arrays.stream(arr).max().getAsLong() + 1;

        while (lt < rt) {

            long mid = (lt + rt) / 2;
            long sum = 0;
            for (int i = 0; i < K; i++) {
                sum += arr[i] / mid;
            }

            if (sum >= N) {
                lt = mid + 1;
            } else {
                rt = mid;
            }
        }

        System.out.println(lt - 1);
    }
}
