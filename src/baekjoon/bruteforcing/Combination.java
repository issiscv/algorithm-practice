package baekjoon.bruteforcing;

import java.util.Scanner;

public class Combination {

    private static int n;
    private static int m;
    private static int[] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();//
        m = scanner.nextInt();//깊이

        arr = new int[m];

        combi(0, 1);
    }

    private static void combi(int v, int s) {

        if (v == m) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                arr[v] = i;
                combi(v+1, i+1);
            }
        }
    }
}
