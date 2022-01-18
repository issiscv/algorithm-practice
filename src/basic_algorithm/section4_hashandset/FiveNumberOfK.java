package basic_algorithm.section4_hashandset;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class FiveNumberOfK {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        TreeSet<Integer> tree = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    tree.add(arr[i] + arr[j] + arr[k]);
                }
            }
        }

        int cnt = 1;
        boolean flag = true;
        for (int i : tree) {
            if (cnt == m) {
                System.out.println(i);
                flag = false;
                break;
            }
            cnt++;
        }
        if (flag) System.out.println(-1);

    }
}
