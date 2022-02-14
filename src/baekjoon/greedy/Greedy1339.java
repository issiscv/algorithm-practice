package baekjoon.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Greedy1339 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String[] arr = new String[N];

        Integer[] cArr = new Integer[26];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.next();
        }

        Arrays.fill(cArr, 0);

        for (int i = 0; i < N; i++) {
            String tmp = arr[i];

            for (int j = 0; j < tmp.length(); j++) {
                cArr[tmp.charAt(j) - 65] += (int)Math.pow(10, tmp.length() - (j + 1));
            }
        }

        Arrays.sort(cArr, Collections.reverseOrder());

        int sum = 0;
        int idx = 9;
        for (int i = 0; i < 9; i++) {
            sum += idx * cArr[i];
            idx--;
        }
        System.out.println(sum);
    }
}
