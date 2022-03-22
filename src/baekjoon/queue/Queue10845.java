package baekjoon.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue10845 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        LinkedList<Integer> queue = new LinkedList<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String str = scanner.next();

            if (str.equals("push")) {
                queue.offer(scanner.nextInt());
            } else if (str.equals("pop")) {
                if (queue.isEmpty()) sb.append("-1\n");
                else sb.append(queue.poll() + "\n");
            } else if (str.equals("size")) {
                sb.append(queue.size() + "\n");
            } else if (str.equals("empty")) {
                if (queue.isEmpty()) sb.append("1\n");
                else sb.append("0\n");
            } else if (str.equals("front")) {
                if (queue.isEmpty()) sb.append("-1\n");
                else sb.append(queue.peek()+"\n");
            } else if (str.equals("back")) {
                if (queue.isEmpty()) sb.append("-1\n");
                else sb.append(queue.get(queue.size()-1)+"\n");
            }
        }
        System.out.println(sb);
    }
}
