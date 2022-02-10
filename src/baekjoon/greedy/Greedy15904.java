package baekjoon.greedy;

import java.util.Scanner;

public class Greedy15904 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        char[] ch = {'U', 'C', 'P', 'C'};
        int idx = 0;

        boolean flag = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch[idx]) {
                idx++;
            }
            if (idx == 4) {
                flag = true;
                break;
            }
        }

        if (flag)
            System.out.println("I love UCPC");
        else
            System.out.println("I hate UCPC");
    }
}
