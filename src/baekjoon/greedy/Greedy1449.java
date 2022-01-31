package baekjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy1449 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();//4
        int L = scanner.nextInt();//2
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        int idx = 0;
        int i = 0, j = 0;
        while (i < N) {

            int tmp = arr[i] + (L-1);//101
            while (j < N && arr[j] <= tmp) {
                j++;
            }

            i = j;
            idx++;
        }
        System.out.println(idx);
    }
}
