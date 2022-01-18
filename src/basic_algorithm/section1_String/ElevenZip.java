package basic_algorithm.section1_String;

import java.util.Scanner;

public class ElevenZip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        char tmp = str.charAt(0);
        int cnt = 0;

        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == tmp) {
                cnt++;
                tmp = str.charAt(i);
            } else {
                if (cnt > 1)
                    answer += (String.valueOf(tmp) + cnt);
                else
                    answer += (String.valueOf(tmp));
                cnt = 1;
                tmp = str.charAt(i);
            }
        }

        if (cnt > 1)
            answer += (String.valueOf(tmp) + cnt);
        else
            answer += (String.valueOf(tmp));

        System.out.println(answer);
    }
}
