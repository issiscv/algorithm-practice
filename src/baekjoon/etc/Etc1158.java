package baekjoon.etc;

import javax.management.Query;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Etc1158 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        int cnt = 1;
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (queue.size() > 1) {
            if (cnt % K == 0)
                sb.append(queue.poll() + ", ");
            else
                queue.offer(queue.poll());
            cnt++;
        }

        sb.append(queue.poll() + ">");
        System.out.println(sb);
    }
}
