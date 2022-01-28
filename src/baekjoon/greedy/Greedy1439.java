package baekjoon.greedy;

import javax.swing.text.Utilities;
import java.util.Scanner;

public class Greedy1439 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        char c = str.charAt(0);
        int one = 0;
        int zero = 0;

        if (c == '0') {
            one++;
        } else {
            zero++;
        }

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i-1)) {
                if (str.charAt(i) == '0') {
                    zero++;
                } else {
                    one++;
                }
            }
        }
        System.out.println(Math.min(one, zero));
    }

}
