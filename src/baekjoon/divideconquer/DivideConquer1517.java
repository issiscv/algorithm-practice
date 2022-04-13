package baekjoon.divideconquer;

import java.util.Scanner;

public class DivideConquer1517 {

    private static int[] arr;
    private static int[] sorted;
    private static long count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        arr = new int[N];
        sorted = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        mergeSort(0, N-1);

        System.out.println(count);
    }

    private static void mergeSort(int lt, int rt) {

        if (lt < rt) {
            int mid = (lt + rt) / 2;

            mergeSort(lt, mid);
            mergeSort(mid + 1, rt);
            merge(lt, mid, rt);
        }
    }

    private static void merge(int lt, int mid, int rt) {

        int i = lt;
        int j = mid + 1;
        int k = lt;

        while (i <= mid && j <= rt) {

            if (arr[i] <= arr[j]) {
                sorted[k++] = arr[i++];
            } else {
                sorted[k++] = arr[j++];
                count += mid + 1 - i;
            }
        }

        while (i <= mid) sorted[k++] = arr[i++];
        while (j <= rt) sorted[k++] = arr[j++];

        for (int l = lt; l <= rt; l++) {
            arr[l] = sorted[l];
        }

    }
}
