package baekjoon.greedy;

import java.util.Scanner;

public class Greedy2864 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();

        String aMin = "";
        String bMin = "";

        String aMax = "";
        String bMax = "";

        for (int i = 0; i < ac.length; i++) {
            if (ac[i] == '6') {
                aMin += "5";
            } else {
                aMin += ac[i];
            }

            if (ac[i] == '5') {
                aMax += "6";
            } else {
                aMax += ac[i];
            }
        }

        for (int i = 0; i < bc.length; i++) {
            if (bc[i] == '6') {
                bMin += "5";
            } else {
                bMin += bc[i];
            }

            if (bc[i] == '5') {
                bMax += "6";
            } else {
                bMax += bc[i];
            }
        }

        System.out.println(((Integer.parseInt(aMin) + Integer.parseInt(bMin)) + " " + (Integer.parseInt(aMax) + Integer.parseInt(bMax))));
    }
}
