package baekjoon.greedy;

import java.util.Scanner;

public class Greedy16953 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int idx = 1;

        while (b != a) {

            if (b < a) {
                idx = -1;
                break;
            }

            String str = String.valueOf(b);

            if (b % 2 != 0 && str.charAt(str.length()-1) != '1') {
                idx = -1;
                break;
            }

            if (b % 2 == 0) {
                b = b / 2;
            } else {
                str = str.substring(0, str.length()-1);
                b = Integer.parseInt(str);
            }
            idx++;
        }

        System.out.println(idx);

    }

}
