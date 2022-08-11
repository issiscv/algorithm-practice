package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Math11653 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            return;
        }

        boolean[] arr = new boolean[N + 1];

        arr[1] = true;

        for (int i = 2; i <= N; i++) {
            for (int j = i * 2; j <= N; j += i) {
                arr[j] = true;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (arr[i] == false) {
                list.add(i);
            }
        }

        while (true) {
            boolean flag = false;

            for (int i = 0; i < list.size(); i++) {

                if (N < 2) {
                    flag = true;
                    break;
                }

                if (N % list.get(i) == 0) {
                    N = N / list.get(i);
                    System.out.println(list.get(i));
                    break;
                }
            }

            if (flag) break;
        }

    }
}
