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

    public static int find5(int n) {
        int cnt = 0;
        while (n >= 5) {
            cnt += n / 5;
            n = n / 5;
        }
        return cnt;
    }

    public static int find2(int n) {
        int cnt = 0;
        while (n >= 2) {
            cnt += n / 2;
            n = n / 2;
        }
        return cnt;

    }

}
