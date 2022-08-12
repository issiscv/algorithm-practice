package basic_algorithm.section6_sortingandsearching;

import java.util.Arrays;
import java.util.Scanner;

public class EightBinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }

        int lt = 0;
        int rt = N-1;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (arr[mid] <= M) {
                lt = mid+1;
            } else {
                rt = mid-1;
            }
        }

        System.out.println(lt);
    }
}
