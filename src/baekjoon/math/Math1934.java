package baekjoon.math;

import java.util.Scanner;

public class Math1934 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int result = gcd(a, b);

            sb.append(a * b / result).append("\n");
        }

        System.out.println(sb.toString());

    }

    private static int gcd(int a, int b) {

        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

}
