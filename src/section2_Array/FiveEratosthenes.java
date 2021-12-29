package section2_Array;

import java.util.Scanner;

public class FiveEratosthenes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n+1];

        int cnt = 0;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == 0) {
                cnt++;
                for (int j = i; j <arr.length; j+=i) {
                    arr[j] = 1;
                }
            }
        }

        System.out.println(cnt);
    }
}
