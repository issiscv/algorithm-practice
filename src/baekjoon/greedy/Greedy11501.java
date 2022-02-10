package baekjoon.greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Greedy11501 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //3
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            //3
            int N = scanner.nextInt();
            int[] arr = new int[N];

            for (int j = 0; j < N; j++) {
                arr[j] = scanner.nextInt();
            }

            int max = Integer.MIN_VALUE;
            long sum = 0;
            for (int j = N-1 ; j >= 0; j--) {
                if (arr[j] > max) {
                    max = arr[j];
                } else {
                    sum += max - arr[j];
                }
            }
            System.out.println(sum);

        }


    }

}
