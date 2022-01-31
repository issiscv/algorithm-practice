package baekjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy2437 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();//7
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > sum + 1) {
                break;
            } else {
                sum += arr[i];
            }
        }

        System.out.println(sum + 1);
    }
}
