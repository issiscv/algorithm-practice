package baekjoon.greedy;

import java.util.Scanner;

public class Greedy15904 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        int[] arr = new int[26];
        char[] ch = {'U', 'C', 'P', 'C'};
        int idx = 0;
        boolean flag = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch[idx]) {
                idx++;
            }
            if(idx == 4) {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("I hate UCPC");
        else
            System.out.println("I love UCPC");

    }
}
