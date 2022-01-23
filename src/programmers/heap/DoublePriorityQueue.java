package programmers.heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class DoublePriorityQueue {

    public static int[] solution(String[] operations) {
        int[] answer = new int[2];

        Queue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> min = new PriorityQueue<>();

        for (String op : operations) {
            String s = String.valueOf(op.charAt(0));
            int i = Integer.parseInt(op.substring(2, op.length()));

            if (s.equals("I")) {
                max.offer(i);
                min.offer(i);
            } else if (i == 1 && !max.isEmpty()) {
                min.remove(max.poll());
            } else if (i == -1 && !min.isEmpty()){
                max.remove(min.poll());
            }
        }

        if (max.isEmpty()) {
            answer[0] = 0;
            answer[1] = 0;
        } else {
            answer[0] = max.peek();
            answer[1] = min.peek();
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        solution(operations);

    }
}
