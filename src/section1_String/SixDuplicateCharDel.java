package section1_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SixDuplicateCharDel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ksekkset
        String str = scanner.next();
        String answer = "";

        for (int i = 0; i < str.length(); i++) {

            char tmp = str.charAt(i);
            int pos = str.indexOf(tmp);

            if (i == pos) answer += tmp;
        }
        System.out.println(answer);
    }
}
