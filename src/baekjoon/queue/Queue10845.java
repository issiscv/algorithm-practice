package baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Queue10845 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);

            if (st.nextToken().equals("push")) {
                queue.offer(Integer.parseInt(st.nextToken()));
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

        System.out.println(sb.toString());
    }
}
