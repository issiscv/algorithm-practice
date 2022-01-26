package baekjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy11399 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        int sum = 0;
        int result = 0;
        //1 2 3 3 4

        for (int i = 0; i < arr.length; i++) {
            sum = (sum+arr[i]);
            result += sum;
        }
        System.out.println(result);
    }
}
