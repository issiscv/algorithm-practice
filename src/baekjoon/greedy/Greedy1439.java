package baekjoon.greedy;

import javax.swing.text.Utilities;
import java.util.Scanner;

public class Greedy1439 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        int zero = 0;
        int one = 0;

        if (str.charAt(0) == '0') {
            zero++;
        } else {
            one++;
        }

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i-1)) {
                if (str.charAt(i) == '1') {
                    one++;
                } else {
                    zero++;
                }
            }
        }

        System.out.println(Math.min(one, zero));

    }

}
