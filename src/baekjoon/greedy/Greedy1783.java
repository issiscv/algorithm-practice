package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Greedy1783 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        int result = 0;

        if (N == 1) {
            System.out.println(1);
            return;
        } else if (N == 2) {
            System.out.println(Math.min((M + 1) / 2, 4));
            return;
        } else {
            if (M >= 7) {
                System.out.println(M-2);
                return;
            } else {
                System.out.println(Math.min(M, 4));
                return;
            }
        }
    }
}
