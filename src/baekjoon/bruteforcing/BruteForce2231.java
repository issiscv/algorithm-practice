package baekjoon.bruteforcing;

import java.util.Scanner;

public class BruteForce2231 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        boolean flag = true;

        for (int i = 1; i <= N; i++) {
            int tmp = di(i);
            if (tmp == N) {
                System.out.println(i);
                flag = false;
                break;
            }
        }

        if (flag) System.out.println(0);
    }

    private static int di(int i) {
        int n = i;

        while (i != 0) {
            int tmp = i % 10;
            i = i / 10;
            n += tmp;
        }
        return n;
    }

}
