package baekjoon.divideconquer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivideConquer11728 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] na = new int[n];
        int[] ma = new int[m];

        for (int i = 0; i < n; i++) {
            na[i] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            ma[i] = scanner.nextInt();
        }

        int lt = 0;
        int rt = 0;

        List<Integer> list = new ArrayList<>();

        while (lt < n && rt < m) {
            if (na[lt] < ma[rt]) list.add(na[lt++]);
            else list.add(ma[rt++]);
        }

        while (lt < n) list.add(na[lt++]);
        while (rt < m) list.add(ma[rt++]);

        StringBuilder sb = new StringBuilder();
        for (Integer i : list) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());
    }
}
