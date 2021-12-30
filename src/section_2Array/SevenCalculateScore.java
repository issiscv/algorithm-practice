package section_2Array;

import java.util.Scanner;

public class SevenCalculateScore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int tmp = scanner.nextInt();

            if (tmp == 0) cnt = 0;
            else cnt++;

            sum += cnt;
        }

        System.out.println(sum);
    }
}
