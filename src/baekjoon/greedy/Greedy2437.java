package baekjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy2437 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        //1 1 2 3 6 7 30
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] > sum + 1) {
                break;
            }
            sum += arr[i];
        }
        System.out.println(sum+1);
    }

}
