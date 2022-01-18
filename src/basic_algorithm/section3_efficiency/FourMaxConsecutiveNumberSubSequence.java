package basic_algorithm.section3_efficiency;

import java.util.Scanner;

public class FourMaxConsecutiveNumberSubSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        int answer = 0;
        int lt = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == m) answer++;

            while (sum >= m) {
                sum -= arr[lt++];
                if (sum == m) answer++;
            }
        }

        System.out.println(answer);
    }
}
