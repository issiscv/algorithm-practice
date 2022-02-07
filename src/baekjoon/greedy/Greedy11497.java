package baekjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy11497 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int[] arr = new int[N];

            for (int j = 0; j < N; j++) {
                arr[j] = scanner.nextInt();
            }
            Arrays.sort(arr);

            int[] ans = new int[N];
            int left = 0;
            int right = N-1;
            //2 4 5 7 9

            for (int j = 0; j < N; j++) {
                if (j % 2 == 0) {
                    ans[left++] = arr[j];
                } else {
                    ans[right--] = arr[j];
                }
            }

            int max = Integer.MIN_VALUE;
            max = Math.abs(ans[0]-ans[N-1]);

            for (int j = 1; j < N; j++) {
                max = Math.max(max, Math.abs(ans[j] - ans[j-1]));
            }
            System.out.println(max);
        }

    }

}
