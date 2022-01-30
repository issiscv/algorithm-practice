package baekjoon.greedy;

import java.util.Scanner;

public class Greedy16953 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int idx = 1;

        boolean flag = true;

        while (b != a) {

            if (b < a) {
                flag = false;
                break;
            }

            String str = String.valueOf(b);

            if (str.charAt(str.length()-1) != '1' && b % 2 != 0) {
                flag = false;
                break;
            }

            if (b % 2 == 0) {
                b = b / 2;
            } else {
                String s = str.substring(0, str.length()-1);
                b = Integer.parseInt(s);
            }
            idx++;
        }

        if (flag) {
            System.out.println(idx);
        } else {
            System.out.println(-1);
        }

    }

}
