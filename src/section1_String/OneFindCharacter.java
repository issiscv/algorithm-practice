package section1_String;

import java.util.Scanner;

public class OneFindCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine().toLowerCase();
        char c = scanner.nextLine().toLowerCase().charAt(0);

        int count = 0;

        char[] cArray = s.toCharArray();

        for (char ca : cArray) {
            if (ca == c) {
                count++;
            }
        }
        System.out.println(count);
    }
}
