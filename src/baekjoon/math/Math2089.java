package baekjoon.math;

import java.util.Scanner;

public class Math2089 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        int N = scanner.nextInt();

        if (N == 0) {
            System.out.println(0);
        } else {
            while (N != 1) {
                sb.append(Math.abs(N % -2));
                N = (int)Math.ceil((double) N / (-2));
            }
            sb.append(N);

            System.out.println(sb.reverse());
        }
    }
}
