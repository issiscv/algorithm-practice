package baekjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy2217 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        //4 10 15

        Arrays.sort(arr);
        int max = arr[n-1];
        //max = 15
        for (int i = 0; i < n; i++) {
            //arr[i] == 4, n-i = 3
            //arr[i] == 10, n-i = 2
            //arr[i] == 15, n-i = 1
            max = Math.max(max, arr[i] * (n-i));
        }
        System.out.println(max);
    }
}
