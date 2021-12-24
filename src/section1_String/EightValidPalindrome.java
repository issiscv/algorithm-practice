package section1_String;

import java.util.Locale;
import java.util.Scanner;

public class EightValidPalindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine().toUpperCase();
        str = str.replaceAll("[^A-Z]", "");
        String reverse = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(reverse)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
