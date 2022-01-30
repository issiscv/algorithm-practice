package baekjoon.greedy;

import java.util.*;

public class Greedy1049 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();//끊어진 기타 줄
        int M = scanner.nextInt();//브랜드 수

        int[] full = new int[M];//패키지
        int[] etc = new int[M];//낱개

        for (int i = 0; i < M; i++) {
            full[i] = scanner.nextInt();
            etc[i] = scanner.nextInt();
        }

        Arrays.sort(full);
        Arrays.sort(etc);

        int a = N / 6;//2
        int b = N % 6;//3

        int i = full[0];//100
        int j = etc[0];//40

        if (N < 6) {
            System.out.println(Math.min(i, N * j));
        } else {
            int calcHelp = Math.min(full[0], etc[0] * 6);
            int answer = calcHelp * (N / 6) + Math.min(calcHelp, etc[0] * (N % 6));
            System.out.println(answer);
        }
    }
}
