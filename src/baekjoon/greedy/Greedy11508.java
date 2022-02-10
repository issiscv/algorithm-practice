package baekjoon.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Greedy11508 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Integer[] arr = new Integer[N];
        long sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());
        long tSum = 0;

        for (int i = 0; i < N; i++) {
            if (i % 3 == 2) {
                sum += tSum;
                tSum = 0;
            } else {
                tSum += arr[i];
            }
        }

        if (tSum != 0) {
            sum += tSum;
        }
        System.out.println(sum);

    }
}
