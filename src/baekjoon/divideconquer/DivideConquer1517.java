package baekjoon.divideconquer;

import java.util.Scanner;

public class DivideConquer1517 {

    private static int[] arr;
    private static int[] sorted;
    private static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        arr = new int[n];
        sorted = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        mergeSort(0, n-1);

        System.out.println(cnt);

    }

    private static void mergeSort(int lt, int rt) {

        if (lt < rt) {
            int mid = (lt + rt) / 2;
            mergeSort(lt, mid);
            mergeSort(mid + 1, rt);
            merge(lt, mid, rt);
        }
    }

    private static long cnt = 0;

    private static void merge(int lt, int mid, int rt) {

        int i = lt;
        int j = mid + 1;
        int k = lt;

        while (i <= mid && j <= rt) {
            if (arr[i] <= arr[j]) {
                sorted[k++] = arr[i++];
            } else {
                sorted[k++] = arr[j++];
                cnt += (mid + 1 - i);
            }
        }

        while (i <= mid) {
            sorted[k++] = arr[i++];
        }

        while (j <= rt) {
            sorted[k++] = arr[j++];
        }

        for (int l = lt; l <= rt; l++) {
            arr[l] = sorted[l];
        }

    }
}
