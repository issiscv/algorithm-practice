package baekjoon.string;

import java.util.Arrays;
import java.util.Scanner;

public class String11656 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        String[] arr = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.substring(i);
        }

        Arrays.sort(arr);

        for (int i = 0; i < str.length(); i++) {
            System.out.println(arr[i]);
        }

    }
}
