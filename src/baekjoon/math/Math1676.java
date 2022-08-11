package baekjoon.math;

import java.util.Scanner;

public class Math1676 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int cnt = 0;

        while (N >= 5) {
            cnt += N / 5;
            N = N / 5;
        }

        System.out.println(cnt);
    }
}

