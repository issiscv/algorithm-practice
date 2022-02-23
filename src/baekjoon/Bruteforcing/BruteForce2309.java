package baekjoon.Bruteforcing;

import java.util.Arrays;
import java.util.Scanner;

public class BruteForce2309 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        int sum = Arrays.stream(arr).sum();
        int gap = sum - 100;
        boolean flag = true;

        for (int i = 0; i < 9; i++) {
            int base = arr[i];
            for (int j = i+1; j < 9; j++) {
                int tmp = arr[j];
                if (base + tmp == gap) {
                    arr[i] = -1;
                    arr[j] = -1;
                    flag = false;
                }
            }
            if (!flag) break;
        }

        for (int i : arr) {
            if (i != -1) System.out.println(i);
        }

    }

}
