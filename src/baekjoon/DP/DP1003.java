package baekjoon.DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DP1003 {
    static int[] result=new int[41];
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int T=scanner.nextInt();
        result[0]=0; result[1]=1; result[2]=1;

        for(int i = 0;i < T;i++){
            int N = scanner.nextInt();
            if (N == 0) {
                System.out.println("1 0");
            } else if (N == 1) {
                System.out.println("0 1");
            } else {
                int fibonacci = fibonacci(N);
                System.out.println(fibonacci);
            }

        }
    }

    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            if(result[n] != 0){
                return result[n];
            }
            else{
                result[n] = fibonacci(n-1) + fibonacci(n-2);
                return result[n];
            }
        }
    }
}
