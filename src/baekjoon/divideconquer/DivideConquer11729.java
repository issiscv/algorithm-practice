package baekjoon.divideconquer;

import java.util.Scanner;

public class DivideConquer11729 {

    public static StringBuilder sb = new StringBuilder();
    static int cnt;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        hanoi(N, 1, 2, 3);

        System.out.println(cnt);
        System.out.println(sb.toString());
    }

    private static void hanoi(int n, int start, int mid, int end) {
        cnt++;
        if (n == 1) {
            sb.append(start + " " + end).append("\n");
            return;
        }

        hanoi(n-1, start, end, mid);
        sb.append(start + " " + end).append("\n");
        hanoi(n-1, mid, start, end);
    }
}

