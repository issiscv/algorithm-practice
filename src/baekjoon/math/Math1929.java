package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Math1929 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        boolean[] flag = new boolean[B+1];

        Arrays.fill(flag, true);

        flag[0] = false;
        flag[1] = false;

        for (int i = 2; i < flag.length; i++) {
            for (int j = i * 2; j < flag.length; j += i) {
                flag[j] = false;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = A; i <= B; i++) {
            if (flag[i]) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
