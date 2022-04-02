package baekjoon.math;

import java.util.Scanner;

public class Math1978 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int cnt = 0;
        for (int i : arr) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) flag = false;
            }

            if (i != 1 && flag == true)
                cnt++;

        }

        System.out.println(cnt);
    }
}
