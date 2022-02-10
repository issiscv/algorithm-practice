package baekjoon.greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Greedy1343 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);;

        String str = scanner.nextLine();
        char[] array = str.toCharArray();

        boolean flag = true;
        String tmp = "";

        for (int i = 0; i < array.length; i++) {
            int cnt = 0;
            int j;
            if (array[i] == '.') {
                tmp += ".";
                continue;
            }
            for (j = i; j < array.length; j++) {
                if (array[j] == 'X' && cnt < 4) {
                    cnt++;
                } else {
                    break;
                }
            }

            if (cnt != 2 && cnt != 4) {
                flag = false;
                break;
            }

            if (cnt == 4) {
                tmp += "AAAA";
            } else if (cnt == 2) {
                tmp += "BB";
            }

            i = j-1;//2
        }


        if (flag)
            System.out.println(tmp);
        else {
            System.out.println(-1);
        }
    }
}
