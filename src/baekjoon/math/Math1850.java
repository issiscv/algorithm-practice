package baekjoon.math;

import java.util.Scanner;

public class Math1850 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();
        long B = scanner.nextLong();

        long gcd = gcd(A, B);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < gcd; i++) {
            sb.append("1");
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
