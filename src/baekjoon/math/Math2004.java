package baekjoon.math;

import java.util.Scanner;

public class Math2004 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int five = find5(N) - find5(M) - find5(N - M);
        int two = find2(N) - find2(M) - find2(N - M);

        System.out.println(Math.min(five, two));
    }

    private static int find5(int i) {
        int cnt = 0;
        while (i >= 5) {
            cnt += i / 5;
            i = i / 5;
        }

        return cnt;
    }

    private static int find2(int i) {
        int cnt = 0;
        while (i >= 2) {
            cnt += i / 2;
            i = i / 2;
        }

        return cnt;
    }
}
