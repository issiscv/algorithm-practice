package basic_algorithm.section3_efficiency;

import java.util.Scanner;

public class SixMaxLengthConsecutiveSubSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int cnt = 0;
        int max = Integer.MIN_VALUE;
        int lt = 0;

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) cnt++;

            while (cnt > m) {
                if (arr[lt++] == 0) cnt--;
            }

            max = Math.max(max, rt - lt + 1);
        }

        System.out.println(max);
    }
}
