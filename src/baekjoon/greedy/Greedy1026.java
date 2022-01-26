package baekjoon.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Greedy1026 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Integer[] minArr = new Integer[n];
        Integer[] maxArr = new Integer[n];

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            minArr[i] = a;
        }

        for (int i = 0; i < n; i++) {
            int b = scanner.nextInt();
            maxArr[i] = b;
        }

        Arrays.sort(minArr);
        Arrays.sort(maxArr, Collections.reverseOrder());

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += (minArr[i] * maxArr[i]);
        }
        System.out.println(sum);

    }
}
