package baekjoon.bruteforcing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BruteForce1065 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N < 100) {
            System.out.println(N);
            return;
        }

        int cnt = 0;

        for (int i = 100; i <= N; i++) {
            boolean flag = di(i);
            if (flag) {
                cnt++;
            }
        }
        System.out.println(cnt + 99);
    }

    private static boolean di(int n) {
        List<Integer> list = new ArrayList<>();
        int dx = Integer.MIN_VALUE;
        while (n != 0) {
            list.add(n % 10);//5 3 1
            n = n / 10;
        }

        for (int i = 0; i < list.size()-1; i++) {
            int tmp = (list.get(i) - list.get(i + 1));

            if (dx == Integer.MIN_VALUE) {
                dx = tmp;
            } else {
                if (dx != tmp) {
                    return false;
                }
            }
        }
        return true;
    }

}
