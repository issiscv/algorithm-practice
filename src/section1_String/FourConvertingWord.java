package section1_String;

import java.util.Scanner;

public class FourConvertingWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tmp = scanner.nextInt();
        String[] sArr = new String[tmp];

        for (int i = 0; i < tmp; i++) {
            sArr[i] = scanner.next();
        }

        for (String s : sArr) {
            String reverser = new StringBuilder(s).reverse().toString();
            System.out.println(reverser);
        }
    }
}
