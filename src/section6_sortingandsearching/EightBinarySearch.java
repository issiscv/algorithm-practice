package section6_sortingandsearching;

import java.util.Arrays;
import java.util.Scanner;

public class EightBinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int solution = solution(m, arr);
        System.out.println(solution);
    }

    private static int solution(int m, int[] arr) {

        Arrays.sort(arr);

        int lt = 0;
        int rt = arr.length - 1;
        int answer = 0;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (arr[mid] == m) {
                answer = mid+1;
                break;
            }

            if (arr[mid] > m) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;

    }
}
