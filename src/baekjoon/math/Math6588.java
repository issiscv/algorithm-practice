package baekjoon.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Math6588 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[] arr = new boolean[1000001];
        arr[1] = true;
        arr[2] = true;
        for (int a = 2; a <= 1000000; a++) {
            for (int j = 2; a * j < 1000000; j++) {
                arr[a * j] = true;
            }
        }

        while (true) {

            int n = scanner.nextInt();

            if (n == 0) {
                break;
            } else {
                boolean flag = true;
                for (int i = 1; i <= n / 2; i++) {
                    if (!arr[i] && !arr[n - i]) {
                        System.out.println(n + " = " + i + " + " + (n - i));
                        flag = false;
                        break;
                    }
                }
                if (flag) System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }
}
