package baekjoon.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Greedy9237 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);;
        int N = scanner.nextInt();
        Integer[] arr = new Integer[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());
        int max = Integer.MIN_VALUE;
        int idx = 2;
        for (int i = 0; i < N; i++) {
            int tmp = arr[i] + idx;
            idx++;
            max = Math.max(max, tmp);
        }
        System.out.println(max);


    }
}
