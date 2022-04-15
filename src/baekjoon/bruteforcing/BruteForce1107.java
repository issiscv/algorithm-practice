package baekjoon.bruteforcing;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BruteForce1107 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();

        boolean[] check = new boolean[10];
        int M = scanner.nextInt();
        for (int i = 0; i < M; i++) {
            int idx = scanner.nextInt();
            check[idx] = true;
        }

        int min = Math.abs(target - 100);
        for (int i = 0; i < 999999; i++) {
            String str = String.valueOf(i);

            boolean flag = true;
            for (int j = 0; j < str.length(); j++) {
                int value = str.charAt(j) - '0';
                if (check[value]) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                min = Math.min(Math.abs(target-i) + str.length(), min);
            }
        }

        System.out.println(min);
    }
}
