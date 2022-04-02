package baekjoon.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Math11653 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if (N == 1) {
            return;
        }

        boolean[] arr = new boolean[N + 1];

        arr[1] = true;

        for (int i = 2; i <= N; i++) {
            for (int j = 2; i * j <= N; j++) {
                arr[i * j] = true;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (arr[i] == false) list.add(i);
        }

        while (true) {
            boolean flag = true;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > N) {
                    flag = false;
                    break;
                }
                if (N % list.get(i) == 0) {
                    N = N / list.get(i);
                    System.out.println(list.get(i));
                    break;
                }
            }
            if (flag == false) break;
        }
    }
}
