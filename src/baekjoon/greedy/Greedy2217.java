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
        Arrays.sort(arr);

        int max = arr[n-1];

        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            max = Math.max(max, tmp * (n-i));
        }

        System.out.println(max);

    }
}
