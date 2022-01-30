package baekjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy1744 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int n = scanner.nextInt();
       int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int l = 0;
        int r = arr.length - 1;
        int answer = 0;

        for (; l < r; l+=2) {
            if (arr[l] < 1 && arr[l+1] < 1) {
                answer += arr[l] * arr[l+1];
            } else {
                break;
            }
        }

        //-3 -2 -1 0 1 2 3 4 5
        for (; r > 0; r-=2) {
            if (arr[r] > 1 && arr[r-1] > 1) {
                answer += arr[r] * arr[r-1];
            } else {
                break;
            }
        }

        for (; l <= r; l++) {
            answer += arr[l];
        }
        System.out.println(answer);
    }
}
