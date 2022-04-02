package baekjoon.math;

import java.util.Scanner;

public class Math1676 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int two = 0;
        int five = 0;

        for (int i = 1; i <= N; i++) {
            int n = i;
            while (n % 2 == 0) {
                two++;
                n = n / 2;
            }

            while (n % 5 == 0) {
                five++;
                n = n / 5;
            }
        }

        System.out.println(Math.min(two, five));
    }
}

