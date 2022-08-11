package baekjoon.math;

import java.util.Scanner;

public class Math10872 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        long recursive = recursive(N);
        System.out.println(recursive);
    }

    private static long recursive(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        return n * recursive(n-1);
    }

}
