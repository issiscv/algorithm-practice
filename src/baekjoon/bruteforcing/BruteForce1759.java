package baekjoon.bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BruteForce1759 {

    private static int N;
    private static int M;
    private static char[] arr;
    private static char[] password;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        password = new char[N];

        arr = new char[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arr[i] = st.nextToken().charAt(0);
        }

        Arrays.sort(arr);

        combi(0, 1);
    }

    private static void combi(int v, int s) {

        if (v == N) {

            int moeum = 0;
            int zaeum = 0;
            for (char c : password) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u') {
                    moeum++;
                } else {
                    zaeum++;
                }
            }

            if (moeum >= 1 && zaeum >= 2) {
                for (char c : password) {
                    System.out.print(c);
                }
                System.out.println();
            }

            return;
        } else {
            for (int i = s; i <= M; i++) {
                password[v] = arr[i-1];
                combi(v+1, i+1);
            }
        }
    }
}
