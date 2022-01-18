package basic_algorithm.section3_efficiency;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OneMergeArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] na = new int[n];
        for (int i = 0; i < n; i++) {
            na[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] ma = new int[m];
        for (int i = 0; i < m; i++) {
            ma[i] = scanner.nextInt();
        }

        List<Integer> list = new ArrayList<>();

        int lt = 0;
        int rt = 0;
        while (lt < na.length && rt < ma.length) {
            if (na[lt] < ma[rt]) list.add(na[lt++]);
            else list.add(ma[rt++]);
        }

        while (lt < n) list.add(na[lt++]);
        while (rt < m) list.add(ma[rt++]);

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
