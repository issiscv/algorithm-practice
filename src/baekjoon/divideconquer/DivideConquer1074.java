package baekjoon.divideconquer;

import java.util.Scanner;

public class DivideConquer1074 {
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pow = (int) Math.pow(2, scanner.nextInt());
        int r = scanner.nextInt();
        int c = scanner.nextInt();

        divide(pow, r, c);
        System.out.println(count);
    }

    private static void divide(int n, int r, int c) {

        if (n == 1)
            return;

        int size = n / 2;

        if (r < n / 2 && c < n / 2) {//1사분면
            divide(size, r, c);
        } else if (r < n / 2 && c < n) {//2사분면
            count += size * size;
            divide(size, r, c - size);
        } else if (r < n && c < n / 2) {//3사분면
            count += size * size * 2;
            divide(size, r - size, c);
        } else {//4사분면
            count += size * size * 3;
            divide(size, r - size, c - size);
        }

    }
}
