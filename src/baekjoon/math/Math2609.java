package baekjoon.math;

import java.util.Scanner;

public class Math2609 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = gcd(a, b);
        System.out.println(result);
        System.out.println(a * b / result);
    }

    private static int gcd(int a, int b) {

        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}
