package baekjoon.divideconquer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivideConquer11728 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] one = new int[N];
        int[] two = new int[M];

        for (int i = 0; i < N; i++) {
            one[i] = scanner.nextInt();
        }

        for (int i = 0; i < M; i++) {
            two[i] = scanner.nextInt();
        }

        int lt = 0;
        int rt = 0;
        int tmp = 0;

        int[] arr = new int[N+M];

        while (lt < N && rt < M) {
            if (one[lt] > two[rt]) {
                arr[tmp++] = two[rt++];
            } else {
                arr[tmp++] = one[lt++];
            }
        }

        if (lt >= N) {
            while (rt < M) {
                arr[tmp++] = two[rt++];
            }
        }

        if (rt >= M) {
            while (lt < N) {
                arr[tmp++] = one[lt++];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i).append(" ");
        }

        System.out.println(sb.toString());

    }
}
