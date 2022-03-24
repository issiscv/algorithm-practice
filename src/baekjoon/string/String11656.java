package baekjoon.string;

import java.util.Arrays;
import java.util.Scanner;

public class String11656 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();

        String[] arr = new String[S.length()];

        for (int i = 0; i < S.length(); i++) {
            arr[i] = S.substring(i);
        }

        Arrays.sort(arr);

        for (String s : arr) {
            System.out.println(s);
        }

    }
}
