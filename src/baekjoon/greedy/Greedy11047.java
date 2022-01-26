package baekjoon.greedy;

import java.util.Scanner;

public class Greedy11047 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();//10
        int k = scanner.nextInt();//4790
        int[] arr = new int[n];

        int answer = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = n-1; i >= 0; i--) {

            if (arr[i] <= k) {
               answer += (k / arr[i]);
               k = k % arr[i];
            }
        }
        System.out.println(answer);
    }
}
