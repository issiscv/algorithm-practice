package baekjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy13305 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long[] len = new long[n-1];
        long[] cost = new long[n];

        for (int i = 0; i < n - 1; i++) {
            len[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            cost[i] = scanner.nextInt();
        }

        // 2 3 1
        //5 2 4 1
        long minCost = cost[0];
        long sum = 0;

        for (int i = 0; i < n-1; i++) {

            if (cost[i] <= minCost) {
                minCost = cost[i];
            }
            sum += minCost * len[i];

        }

        System.out.println(sum);
    }
}
