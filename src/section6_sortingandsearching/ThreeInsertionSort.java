package section6_sortingandsearching;

import java.util.Scanner;

public class ThreeInsertionSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 1; i < n; i++) {
            int j;
            int key = arr[i];

            for (j = i-1; j >= 0 && arr[j] > key; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = key;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
