package baekjoon.greedy;

import java.util.Scanner;

public class Greedy19941 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();//20
        int K = scanner.nextInt();//1

        //HHPHPPHHPPHPPPHPHPHP
        String s = scanner.next();
        char[] arr = s.toCharArray();

        int sum = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] == 'P') {
                int start = i - K;//1
                int end = i + K;//3

                if (start < 0) start = 0;
                if (end >= N-1) end = N-1;

                for (int j = start; j <= end; j++) {
                    if (arr[j] == 'H') {
                        arr[j] = 'X';
                        sum++;
                        break;
                    }
                }
            }
        }
        System.out.println(sum);

    }
}
