package basic_algorithm.section2_Array;

import java.util.Scanner;

public class OneBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        int tmp = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > tmp) System.out.print(arr[i] + " ");
            tmp = arr[i];
        }

    }
}
