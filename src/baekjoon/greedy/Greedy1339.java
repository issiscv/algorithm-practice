package baekjoon.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Greedy1339 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] strArr = new String[n];

        Integer[] arr = new Integer[26];
        Arrays.fill(arr, 0);

        for (int i = 0; i < n; i++) {
            strArr[i] = scanner.next();
        }

        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];

            for (int j = 0; j < str.length(); j++) {
                int pow = (int)Math.pow(10, str.length() - (1+j));
                int tmp = str.charAt(j) - 65;
                arr[tmp] += pow;
            }
        }

        Arrays.sort(arr, Collections.reverseOrder());

        int idx = 9;
        int sum = 0;
        for (int i = 0; i < 9; i++) {

            sum += (arr[i]*idx--);
        }
        System.out.println(sum);
    }
}
