package baekjoon.string;

import java.util.Scanner;

public class String11655 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isLowerCase(c)) {
                int asc = c - 'a';
                int addAsc = asc + 13;

                if (addAsc >= 'a' - 'a' && addAsc <= 'z' - 'a') {
                    sb.append((char)(addAsc + 'a'));
                } else {
                    int tmp = addAsc - 'z' + 'a' - 1;
                    sb.append((char)(tmp + 'a'));
                }

            } else if (Character.isUpperCase(c)) {
                int asc = c - 'A';
                int addAsc = asc + 13;

                if (addAsc >= 'A' - 'A' && addAsc <= 'Z' - 'A') {
                    sb.append((char)(addAsc + 'A'));
                } else {
                    int tmp = addAsc - 'Z' + 'A' - 1;
                    sb.append((char)(tmp + 'A'));
                }
            } else {
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
    }
}
