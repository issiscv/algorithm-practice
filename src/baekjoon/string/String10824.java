package baekjoon.string;

import java.util.Scanner;

public class String10824 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = new String[4];

        for (int i = 0; i < 4; i++) {
            arr[i] = scanner.next();
        }

        String a = arr[0] + arr[1];
        String b = arr[2] + arr[3];

        System.out.println(Long.parseLong(a) + Long.parseLong((b)));

    }
}
