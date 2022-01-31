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

        int lt = 0;
        int rt = arr.length - 1;
        int answer = 0;

        for (; lt < rt; lt+=2) {
            if (arr[lt] < 1 && arr[lt+1] < 1) {
                answer += (arr[lt] * arr[lt+1]);
            } else {
                break;
            }
        }

        for (; rt > 0; rt-=2) {
            if (arr[rt] > 1 && arr[rt-1] > 1) {
                answer += (arr[rt] * arr[rt-1]);
            } else {
                break;
            }
        }

        //-5 -4 -3 -2 -1 0 1 2 3 4 5 6
        for (; lt <= rt ; lt++) {
            answer += arr[lt];
        }

        System.out.println(answer);
    }
}
