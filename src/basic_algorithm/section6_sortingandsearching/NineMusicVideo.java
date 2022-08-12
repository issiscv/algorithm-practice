package basic_algorithm.section6_sortingandsearching;

import java.util.Arrays;
import java.util.Scanner;

public class NineMusicVideo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int lt = arr[N-1];
        int rt = Arrays.stream(arr).sum();

        int answer = 0;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (record(mid, arr) > M) {
                lt = mid + 1;
            } else {
                rt = mid - 1;
                answer = mid;
            }
        }

        System.out.println(answer);
    }

    private static int record(int minute, int[] arr) {
        int cnt = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            if (sum + arr[i] > minute) {
                sum = arr[i];
                cnt++;
            } else {
                sum += arr[i];
            }
        }

        return cnt;
    }
}
