package programmers.level_2;

import javax.management.Query;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lv2더_맵게 {

    public static int solution(int[] scoville, int K) {

        Queue<Integer> queue = new PriorityQueue<>();

        for (int s : scoville) {
            queue.offer(s);
        }

        int count = 0;
        while (queue.peek() < K && queue.size() > 1) {
            int a = queue.poll();
            int b = queue.poll();

            int value = a + b * 2;
            queue.offer(value);
            count++;
        }

        if (queue.peek() <= K) {
            return -1;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] scovile = {1, 2, 3, 9, 10, 12};
        int k = 7;
        solution(scovile, k);
    }

}
