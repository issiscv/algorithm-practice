package baekjoon.math;

import java.util.Scanner;

public class Math1929 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        boolean[] arr = new boolean[M+1];
        arr[1] = true;

        //2~16
        for (int i = 2; i <= M; i++) {
            for (int j = 2; j * i <= M; j++) {
                arr[j * i] = true;
            }
        }

        for (int i = N; i <= M; i++) {
            if (arr[i] == false) System.out.println(i);
        }

    }
}
