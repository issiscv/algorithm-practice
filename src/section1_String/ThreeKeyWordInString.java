package section1_String;

import java.util.Scanner;

public class ThreeKeyWordInString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        String tmp = "";
        String str = scanner.nextLine();
        String[] sa = str.split(" ");

        for (String s : sa) {
            if (s.length() > max) {
                max = s.length();
                tmp = s;
            }
        }

        System.out.println(tmp);
    }
}
