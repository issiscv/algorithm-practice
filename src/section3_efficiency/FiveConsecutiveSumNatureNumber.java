package section3_efficiency;

import java.util.Scanner;

public class FiveConsecutiveSumNatureNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;
        int answer = 0;
        int lt = 1;
        //1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
        for (int i = 1; i < n; i++) {
            sum += i;
            if (sum == n) answer++;

            while (sum > n) {
                sum -= lt++;
                if (sum == n) answer++;
            }
        }
        System.out.println(answer);
    }
}
