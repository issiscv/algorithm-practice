package baekjoon.deck;

import java.util.LinkedList;
import java.util.Scanner;

public class Deque10866 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        LinkedList<Integer> deque = new LinkedList<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String str = scanner.next();

            if (str.equals("push_front")) {
                deque.addFirst(scanner.nextInt());
            } else if (str.equals("push_back")) {
                deque.addLast(scanner.nextInt());
            } else if (str.equals("pop_front")) {
                if (deque.isEmpty())
                    sb.append("-1\n");
                else
                    sb.append(deque.pollFirst() + "\n");
            } else if (str.equals("pop_back")) {
                if (deque.isEmpty())
                    sb.append("-1\n");
                else
                    sb.append(deque.pollLast() + "\n");
            } else if (str.equals("size")) {
                sb.append(deque.size() + "\n");
            } else if (str.equals("empty")) {
                if (deque.isEmpty()) sb.append("1\n");
                else sb.append("0\n");
            } else if (str.equals("front")) {
                if (deque.isEmpty())
                    sb.append("-1\n");
                else
                    sb.append(deque.getFirst() + "\n");
            } else if (str.equals("back")) {
                if (deque.isEmpty())
                    sb.append("-1\n");
                else
                    sb.append(deque.getLast() + "\n");
            }
        }
        System.out.println(sb);

    }

}
