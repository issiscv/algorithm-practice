package baekjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy18310 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int i = (N - 1) / 2;
        System.out.println(arr[i]);

    }
}
