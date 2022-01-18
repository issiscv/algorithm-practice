package basic_algorithm.section2_Array;

import java.util.Scanner;

public class TwoVisibleStudent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int cnt = 0;
        for (int i : arr) {
            if (i > max) {
                max = i;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
