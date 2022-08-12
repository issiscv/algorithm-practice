package baekjoon.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2805 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        long lt = 0;
        long rt = Arrays.stream(arr).max().getAsInt();

        while (lt < rt) {

            long mid = (lt + rt) / 2;
            long sum = 0;
            for (int i = 0; i < N; i++) {
                long result = arr[i] - mid;
                if (result > 0)
                    sum += result;
            }

            if (sum >= K) {
                lt = mid + 1;
            } else {
                rt = mid;
            }
        }
        System.out.println(lt-1);
    }
}
