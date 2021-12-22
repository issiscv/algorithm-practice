package section1_String;

import java.util.Scanner;

public class TwoLowerCaseUpperCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer = "";

        String s = scanner.nextLine();

        char[] cArray = s.toCharArray();

        for (char c : cArray) {
            if (Character.isLowerCase(c)) answer += Character.toUpperCase(c);
            else answer += Character.toLowerCase(c);
        }

        System.out.println(answer);
    }
}
