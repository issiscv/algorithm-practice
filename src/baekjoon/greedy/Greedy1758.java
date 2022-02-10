package baekjoon.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Greedy1758 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Integer[] arr = new Integer[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        long sum = 0;

        for (int i = 0; i < N; i++) {
            long t = arr[i] - (i + 1 - 1);
            if (t > 0)
                sum += t;
        }
        System.out.println(sum);
    }

}
