package baekjoon.greedy;

import java.util.Scanner;

public class Greedy19939 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= k; i++) {
            sum += i;
        }

        n = n - sum;

        if (n < 0) {
            System.out.println(-1);
        } else {
            if (n % k == 0) {
                System.out.println(k-1);
            } else {
                System.out.println(k);
            }
        }

    }
}
