package baekjoon.greedy;

import java.util.*;

public class Greedy1049 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();//끊어진 기타줄 수
        int M = scanner.nextInt();//브랜드 수

        int[] full = new int[M];
        int[] etc = new int[M];

        for (int i = 0; i < M; i++) {
            full[i] = scanner.nextInt();
            etc[i] = scanner.nextInt();
        }

        Arrays.sort(full);
        Arrays.sort(etc);

        //6
        int f = full[0];
        int e = etc[0];
        
        //6개를 살 때 뭐가 더 싼지
        int min = Math.min(f, e*6);

        if (N < 6) {
            System.out.println(Math.min(f, e*N));
        } else {
            System.out.println((N / 6) * min + Math.min(min, e * (N % 6)));
        }
    }

}
