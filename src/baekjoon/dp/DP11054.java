package baekjoon.dp;

import java.util.Arrays;
import java.util.Scanner;

public class DP11054 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] ldp =  new int[N];
        ldp[0] = 1;
        for (int i = 1; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                if (arr[j] < arr[i]) {
                    ldp[i] = Math.max(ldp[j], ldp[i]);
                }
            }
            ldp[i] += 1;
        }

        int[] rdp = new int[N];
        rdp[N-1] = 1;
        for (int i = N-2; i >= 0; i--) {//8
            for (int j = N-1; j >= i; j--) {//9
                if (arr[j] < arr[i]) {
                    rdp[i] = Math.max(rdp[j], rdp[i]);
                }
            }
            rdp[i] += 1;
        }

        long max = -1;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, ldp[i] + rdp[i] - 1);
        }
        System.out.println(max);

    }

}