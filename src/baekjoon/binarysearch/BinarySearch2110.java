package baekjoon.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2110 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int C = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int lt = 0;
        int rt = Arrays.stream(arr).max().getAsInt();

        while (lt < rt) {
            int mid = (lt + rt) / 2;
            //1 2 4 8 9
            int cnt = 1;
            int flag = 0;
            for (int i = 1; i < N; i++) {
                if (arr[i] - arr[flag] >= mid) {
                    cnt++;
                    flag = i;
                }
            }

            if (cnt >= C) {
                lt = mid + 1;
            } else {
                rt = mid;
            }
        }

        System.out.println(lt - 1);

    }
}
