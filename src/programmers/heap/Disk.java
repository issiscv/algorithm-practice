package programmers.heap;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Disk {

    public static int solution(int[][] jobs) {
        int answer = 0;

        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);
        Queue<int[]> queue = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

        int count = 0;
        int i = 0;
        int now = 0;
        while (count < jobs.length) {

            while (i < jobs.length && jobs[i][0] <= now) {
                queue.offer(jobs[i++]);
            }

            if (queue.isEmpty()) {
                now = jobs[i][0];
            } else {
                int[] tmp = queue.poll();
                answer += tmp[1] + now - tmp[0];
                now += tmp[1];
                count++;
            }
        }

        return answer / jobs.length;
    }

    public static void main(String[] args) {
        int[][] jobs = {
            {0, 3},
            {1, 9},
            {2, 6}
        };

        int solution = solution(jobs);
        System.out.println(solution);
    }
}
