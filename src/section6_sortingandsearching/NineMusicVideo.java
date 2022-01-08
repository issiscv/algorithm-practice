package section6_sortingandsearching;

import java.util.Arrays;
import java.util.Scanner;

public class NineMusicVideo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int solution = solution(arr, m);
        System.out.println(solution);
    }

    private static int solution(int[] arr, int m) {

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        int answer = 0;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            int count = extract(arr, mid);

            if (count > m) {
                lt = mid + 1;
            } else {
                rt = mid - 1;
                answer = mid;
            }
        }
        return answer;
    }

    private static int extract(int[] arr, int mid) {

        int sum = 0;
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > mid) {
                count++;
                sum = arr[i];
            }
        }

        return count;
    }
}
