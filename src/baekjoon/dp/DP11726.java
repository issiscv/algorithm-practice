package baekjoon.dp;

import java.util.Scanner;

public class DP11726 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[1001];

        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i <= N; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 10007;
        }

        System.out.println(arr[N]% 10007);
    }
}
