package baekjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy2012 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N+1];

        for (int i = 1; i <= N; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        long sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += Math.abs(arr[i] - i);
        }

        System.out.println(sum);
    }
}
