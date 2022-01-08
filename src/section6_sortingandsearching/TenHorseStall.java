package section6_sortingandsearching;

import java.util.Arrays;
import java.util.Scanner;

public class TenHorseStall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int answer = solution(m, arr);
        System.out.println(answer);
    }

    private static int solution(int m, int[] arr) {

        Arrays.sort(arr);

        int lt = 0;
        int rt = Arrays.stream(arr).max().getAsInt();
        int answer = 0;
        while (lt <= rt) {

            int mid = (lt + rt) / 2;
            int count = extract(arr, mid);

            if (count >= m) {
                lt = mid + 1;
                answer = mid;
            } else {
                rt = mid - 1;
            }

        }

        return answer;
    }

    private static int extract(int[] arr, int mid) {

        int count = 1;
        int s = arr[0];
        //1 2 4 8 9
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - s >= mid) {
                count++;
                s = arr[i];
            }
        }

        return count;
    }
}
