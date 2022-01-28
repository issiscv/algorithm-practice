package baekjoon.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Greedy1339 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] strArr = new String[n];
        Integer[] alphabet = new Integer[26];

        Arrays.fill(alphabet, 0);

        for (int i = 0; i < n; i++) {
            strArr[i] = scanner.next();
        }

        for (int i = 0; i < n; i++) {
            String str = strArr[i];

            for (int j = 0; j < str.length(); j++) {
                int idx = str.charAt(j) - 65;
                int pow = (int)Math.pow(10, str.length() - (j + 1));
                alphabet[idx] += pow;
            }
        }

        Arrays.sort(alphabet, Collections.reverseOrder());
        int i = 9;
        int sum = 0;
        for (int j = 0; j < 9; j++) {
            sum += alphabet[j] * i--;
        }
        System.out.println(sum);
    }
}
