package baekjoon.string;

import java.util.Scanner;

public class String11655 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.nextLine();

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (Character.isAlphabetic(c)) {
                if (Character.isUpperCase(c)) {
                    if (c + 13 >= 65 && c + 13 <= 90) {
                        System.out.print((char)(c + 13));
                    } else if (c + 13 > 90) {
                        System.out.print((char)(c + 13 - 26));
                    }
                } else {
                    if (c + 13 >= 97 && c + 13 <= 122) {
                        System.out.print((char)(c + 13));
                    } else if (c + 13 > 122) {
                        System.out.print((char)(c + 13 - 26));
                    }
                }
            } else if (Character.isDigit(c)) {
                System.out.print(c);
            } else {
                System.out.print(c);
            }

        }
    }
}
