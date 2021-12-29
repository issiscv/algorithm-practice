package section2_Array;

import java.util.Scanner;

public class SixReversePrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();

            String tmp = Integer.toString(input);
            String reverse = new StringBuilder(tmp).reverse().toString();

            int reverseInt = Integer.parseInt(reverse);

            arr[i] = reverseInt;
        }

        for (int i = 0; i < n; i++) {

            boolean flag = true;
            int num = arr[i];

            for (int j = 2; j < arr[i]; j++) {
                if (num % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag && num != 1) {
                System.out.print(num + " ");
            }
        }

    }
}

