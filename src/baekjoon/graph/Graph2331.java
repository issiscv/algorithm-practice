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
            int tmp = list.get(list.size()-1);
            int result = 0;

            while (tmp > 0) {
                result += Math.pow(tmp % 10, P);
                tmp = tmp / 10;
            }

            if (list.contains(result)) {
                int i = list.indexOf(result);
                System.out.println(i);
                break;
            }

            list.add(result);
        }
    }
}