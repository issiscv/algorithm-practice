package baekjoon.string;

import java.util.Arrays;
import java.util.Scanner;

public class String10809 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        int[] arr = new int[26];

        Arrays.fill(arr, -1);

        for (int i = 0; i < s.length(); i++) {
            int asc = s.charAt(i);

            if (arr[asc-97] == -1) {
                arr[asc-97] = i;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}
