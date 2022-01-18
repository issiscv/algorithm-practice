package basic_algorithm.section6_sortingandsearching;

import java.util.Scanner;

public class FourLRU {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] cache = new int[n];
        for (int i : arr) {
            int pos = -1;
            for (int j = 0; j < n; j++) {
                if (cache[j] == i) pos = j;
            }
            if (pos == -1) {
                for (int j = n-1; j > 0 ; j--) {
                    cache[j] = cache[j-1];
                }
                cache[0] = i;
            } else {
                for (int j = pos; j > 0 ; j--) {
                    cache[j] = cache[j-1];
                }
                cache[0] = i;
            }
        }

        for (int i : cache) {
            System.out.print(i + " ");
        }
    }
}
