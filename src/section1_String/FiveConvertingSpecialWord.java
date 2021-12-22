package section1_String;

import java.util.Scanner;

public class FiveConvertingSpecialWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        char[] cArray = str.toCharArray();

        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(cArray[lt])) lt++;
            else if (!Character.isAlphabetic(cArray[rt])) rt--;
            else {
                char tmp = cArray[lt];
                cArray[lt] = cArray[rt];
                cArray[rt] = tmp;
                lt++;
                rt--;
            }
        }

        System.out.println(new String(cArray));
    }
}
