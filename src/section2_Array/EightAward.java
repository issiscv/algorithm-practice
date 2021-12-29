package section2_Array;

import java.util.Scanner;

public class EightAward {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int max = arr[i];
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] > max) {
                    cnt++;
                }
            }

            result[i] = cnt + 1;
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
