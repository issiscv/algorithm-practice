package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Greedy10610 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N.length(); i++) {
            list.add(N.charAt(i) - '0');
        }

        Collections.sort(list);

        if (list.get(0) != 0) {
            System.out.println(-1);
        } else {
            int sum = 0;

            for (int i = 0; i < N.length(); i++) {
                sum += list.get(i);
            }

            if (sum % 3 == 0) {
                for (int i = N.length() - 1; i >= 0; i--) {
                    System.out.print(list.get(i));
                }
            } else {
                System.out.println(-1);
            }

        }
    }
}
