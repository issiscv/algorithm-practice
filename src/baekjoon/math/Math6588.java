package baekjoon.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Math6588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] arr = new boolean[1000001];

        arr[0] = true;
        arr[1] = true;

        for (int i = 2; i <= 1000000; i++) {
            for (int j = i * 2; j <= 1000000; j += i) {
                arr[j] = true;
            }
        }

        while (true) {

            int n = scanner.nextInt();
            boolean flag = false;
            if (n == 0) {
                break;
            } else {
                for (int i = 1; i <= n / 2; i++) {
                    if (!arr[i] && !arr[n-i]) {
                        System.out.println(n + " = " + i +" + " + (n-i));
                        flag = true;
                        break;
                    }
                }
            }

            if (!flag) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }

    }
}
