package programmers.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class Spicy {

    public static int solution(int[] scoville, int k) {
        int answer = 0;

        Queue<Integer> queue = new PriorityQueue<>();
        int count = 0;

        for (Integer s : scoville) {
            queue.offer(s);
        }

        while (queue.size() > 1 && queue.peek() <= k) {
            int a = queue.poll();
            int b = queue.poll();

            int c = a + (b * 2);
            queue.offer(c);

            count++;
        }

        if (queue.size() <= 1 && queue.peek() < k)
            count = -1;

        return count;
    }

    public static void main(String[] args) {
        int[] scovile = {1, 2, 3, 9, 10, 12};
        int k = 7;

        int solution = solution(scovile, k);
        System.out.println(solution);

    }
}
