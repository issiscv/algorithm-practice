package baekjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy1744 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int lt = 0;
        int rt = arr.length - 1;

        //-6 -5 -4 -3 -2  0 1 2 3 4 5
        int sum = 0;
        for (; lt < rt; lt+=2) {
            if (arr[lt] < 1 && arr[lt+1] < 1) {
                sum += arr[lt] * arr[lt+1];
            } else {
                break;
            }
        }

        for (; rt > 0; rt-=2) {
            if (arr[rt] > 1 && arr[rt-1] > 1) {
                sum += arr[rt] * arr[rt-1];
            } else {
                break;
            }
        }

        for (; lt <= rt; lt++) {
            sum += arr[lt];
        }
        System.out.println(sum);
    }
}
