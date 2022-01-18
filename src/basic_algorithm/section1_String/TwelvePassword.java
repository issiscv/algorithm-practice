package basic_algorithm.section1_String;

import java.util.Scanner;

public class TwelvePassword {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();
        String str = scanner.next();

        String answer = "";

        for (int i = 0; i < cnt; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');

            int num = Integer.parseInt(tmp, 2);
            answer += (char)num;

            str = str.substring(7);
        }

        System.out.println(answer);
    }
}
