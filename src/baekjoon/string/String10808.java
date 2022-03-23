package baekjoon.string;

import java.util.Scanner;

public class String10808 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            int asc = (int) tmp;

            arr[asc-97]++;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
