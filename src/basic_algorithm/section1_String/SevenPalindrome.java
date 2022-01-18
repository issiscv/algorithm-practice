package basic_algorithm.section1_String;

import java.util.Scanner;

public class SevenPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        String reverse = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(reverse)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
