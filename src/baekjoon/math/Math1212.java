package baekjoon.math;

import java.util.Scanner;

public class Math1212 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        String[] arr = {"000", "001", "010",
                        "011", "100", "101",
                        "110", "111"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - '0';

            if (i == 0 && idx < 4) {
                if (idx < 2) {
                    sb.append(arr[idx].substring(2));
                } else {
                    sb.append(arr[idx].substring(1));
                }
            } else {
                sb.append(arr[idx]);
            }
        }

        System.out.println(sb.toString());
    }
}
