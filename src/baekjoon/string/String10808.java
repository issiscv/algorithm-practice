package baekjoon.string;

import java.util.Scanner;

public class String10808 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';
            arr[idx]++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
