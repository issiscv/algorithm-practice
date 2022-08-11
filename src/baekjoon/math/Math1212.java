package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Math1212 {

    public static void main(String[] args) throws IOException {
        String[] arr = {"000", "001", "010",
                        "011", "100", "101",
                        "110", "111"};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - '0';

            if (i == 0 && n < 4) {
                if (n >= 2) {
                    sb.append(arr[n].substring(1));
                } else {
                    sb.append(arr[n].substring(2));
                }
            } else {
                sb.append(arr[n]);
            }
        }

        System.out.println(sb.toString());
    }

}
