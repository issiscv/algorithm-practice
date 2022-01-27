package baekjoon.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Greedy11047 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();//10
        int k = scanner.nextInt();//4790
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());
        int count = 0;
        for (int i = 0; i < n; i++) {

            if (arr[i] <= k) {
                count += k / arr[i];
                k = k % arr[i];
            }
        }

        System.out.println(count);
    }
}
