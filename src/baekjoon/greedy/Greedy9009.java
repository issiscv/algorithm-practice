package baekjoon.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Greedy9009 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();

            List<Integer> list = fibo(N);
            Collections.sort(list, Collections.reverseOrder());
            List<Integer> result = new ArrayList<>();

            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) <= N) {
                    N -= list.get(j);
                    result.add(list.get(j));
                }
                if (N == 0) {
                    break;
                }
            }
            Collections.sort(result);
            for (int a : result) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }

    private static List<Integer> fibo(int N) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);

        for (int j = 2;; j++) {
            int tmp = list.get(j-1) + list.get(j-2);

            if (tmp > N) {
                break;
            }
            list.add(tmp);
        }
        return list;
    }
}
