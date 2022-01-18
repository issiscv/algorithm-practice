package basic_algorithm.section3_efficiency;

import java.util.Scanner;

public class ThreeSlidingWindow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();//10
        int m = scanner.nextInt();//3

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += arr[i];
        }
        max = sum;
        for (int i = m; i < n; i++) {
            sum -= arr[i-m];
            sum += arr[i];

            max = Math.max(max, sum);
        }

        System.out.println(max);

    }
}
