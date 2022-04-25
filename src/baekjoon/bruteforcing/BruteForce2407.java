package baekjoon.bruteforcing;

import java.math.BigInteger;
import java.util.Scanner;

public class BruteForce2407 {

    public static BigInteger dpCombi[][];

    public static void setDpCombination(int n, int m){

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    dpCombi[i][j] = new BigInteger("1");
                } else {
                    dpCombi[i][j] = dpCombi[i-1][j-1].add(dpCombi[i-1][j]);
                }
            }
        }

    }

    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        dpCombi = new BigInteger[1001][1001];

        setDpCombination(n, m);

        System.out.println(dpCombi[n][m]);

    }
}
