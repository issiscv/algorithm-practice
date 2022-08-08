package baekjoon.string;

import java.util.Arrays;
import java.util.Scanner;

public class String10809 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';
            if (arr[idx] == -1) {
                arr[idx] = i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
