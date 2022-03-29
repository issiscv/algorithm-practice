package baekjoon.math;

import java.util.Scanner;

public class Math2745 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        str = new StringBuilder(str).reverse().toString();
        int B = scanner.nextInt();

        long sum = 0;

        for (int i = 0; i < str.length(); i++) {

            char tmp = str.charAt(i);
            long pow = (long) Math.pow(B, i);

            if (Character.isDigit(tmp)) {
                int t = tmp - '0';
                sum += t * pow;
            } else {
                int t = tmp - 'A' + 10;
                sum += t * pow;
            }
        }

        System.out.println(sum);
    }
}
