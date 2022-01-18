package basic_algorithm.section3_efficiency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TwoIntersection {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] na = new int[n];
        for (int i = 0; i < n; i++) {
            na[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] ma = new int[m];
        for (int i = 0; i < m; i++) {
            ma[i] = scanner.nextInt();
        }

        Arrays.sort(na);
        Arrays.sort(ma);

//        1 2 3 5 9
//        2 3 5 7 8

        int lt = 0;
        int rt = 0;
        List<Integer> answer = new ArrayList<>();

        while (lt < na.length && rt < ma.length) {
            if (na[lt] < ma[rt]) lt++;
            else if (na[lt] > ma[rt]) rt++;
            else {
                answer.add(na[lt]);
                lt++;
                rt++;
            }
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
