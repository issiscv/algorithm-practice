package basic_algorithm.section1_String;

import java.util.Scanner;

public class NineOnlyNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        char[] ca = str.toCharArray();

        String answer = "";

        for (char c : ca) {
            if (!Character.isAlphabetic(c)) {
                answer += c;
            }
        }

        System.out.println(Integer.parseInt(answer));
    }
}
