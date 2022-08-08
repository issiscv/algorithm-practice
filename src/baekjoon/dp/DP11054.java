package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DP11054 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N+1];

        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] ldp = new int[N+1];
        ldp[1] = 1;

        for (int i = 2; i <= N; i++) {
            ldp[i] = 1;
            for (int j = 1; j < i; j++) {
                if (arr[i] > arr[j]) {
                    ldp[i] = Math.max(ldp[i], ldp[j] + 1);
                }
            }
        }

        int[] rdp = new int[N+1];
        rdp[N] = 1;

        for (int i = N-1; i >= 1; i--) {
            rdp[i] = 1;
            for (int j = N; j > i; j--) {
                if (arr[i] > arr[j]) {
                    rdp[i] = Math.max(rdp[i], rdp[j] + 1);
                }
            }
        }

        long max = -1;
        for (int i = 1; i <= N; i++) {
            max = Math.max(max, ldp[i] + rdp[i] - 1);
        }
        System.out.println(max);

    }
}