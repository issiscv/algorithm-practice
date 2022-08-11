package baekjoon.math;

import java.util.Scanner;

public class Math9613 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int[] arr = new int[N];

            for (int j = 0; j < N; j++) {
                arr[j] = scanner.nextInt();
            }
            long sum = 0;

            for (int j = 0; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    long gcd = gcd(arr[j], arr[k]);
                    sum += gcd;
                }
            }

            sb.append(sum).append("\n");
        }

        System.out.println(sb.toString());
    }

    private static long gcd(long a, long b) {

        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

}
