package baekjoon.sort;

import java.util.*;

public class Sort2751 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            list.add(a);
        }

        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(Integer c : list) {
            sb.append(c).append("\n");
        }

        System.out.println(sb);

    }

}
