package baekjoon.sort;

import java.util.*;

public class Sort2751 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }

        Collections.sort(list);
        StringBuilder sb = new StringBuilder();

        for (Integer i : list) {
            sb.append(i).append("\n");
        }

        System.out.println(sb.toString());

    }

}
