package baekjoon.greedy;

import java.util.Scanner;

public class Greedy1541 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        String[] splitMin = str.split("\\-");
        int sum = Integer.MIN_VALUE;

        for (String s : splitMin) {
            int tmp = 0;

            String[] split = s.split("\\+");
            for (String sp : split) {
                tmp += Integer.parseInt(sp);
            }

            if (sum == Integer.MIN_VALUE) {
                sum = tmp;
            } else {
                sum -= tmp;
            }
        }
        System.out.println(sum);
    }
}
