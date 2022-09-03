package programmers.level_2;

import java.util.LinkedList;
import java.util.Queue;

public class Lv2두_큐_합_같게_만들기 {

    public static long solution(int[] queue1, int[] queue2) {
        long answer = 0;

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        long sum1 = 0;
        long sum2 = 0;

        for (int i = 0; i < queue1.length; i++) {
            int value = queue1[i];
            q1.offer(value);
            sum1 += value;
        }

        for (int i = 0; i < queue1.length; i++) {
            int value = queue2[i];
            q2.offer(value);
            sum2 += value;
        }

        while (sum1 != sum2) {
            answer++;
            if (sum1 > sum2) {
                int value = q1.poll();
                sum1 -= value;
                sum2 += value;
                q2.offer(value);
            } else {
                int value = q2.poll();
                sum1 += value;
                sum2 -= value;
                q1.offer(value);
            }

            if (answer > (queue1.length + queue2.length) * 2) return -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] queue1 = {3, 2, 7, 2};
        int[] queue2 = {4, 6, 5, 1};
        long solution = solution(queue1, queue2);
        System.out.println(solution);
    }

}
