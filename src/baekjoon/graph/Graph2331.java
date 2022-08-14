package baekjoon.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graph2331 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int P = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        list.add(A);

        while (true) {
            int sum = 0;
            int tmp = list.get(list.size() - 1);

            while (tmp != 0) {
                sum += (int)Math.pow(tmp % 10, P);
                tmp = tmp / 10;
            }

            if (list.contains(sum)) {
                int answer = list.indexOf(sum);
                System.out.println(answer);
                break;
            }

            list.add(sum);
        }
    }
}