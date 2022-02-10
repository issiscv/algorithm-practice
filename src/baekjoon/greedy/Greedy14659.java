package baekjoon.greedy;

import java.util.Scanner;

public class Greedy14659 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length-1; i++) {

            int cnt = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    cnt++;
                } else {
                    break;
                }
            }

            max = Math.max(max, cnt);

        }
        System.out.println(max);

    }
}
