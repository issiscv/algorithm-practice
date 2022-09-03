package programmers.level_2;

import java.util.*;

public class Lv2기능_개발 {

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        int[] lessProgress = new int[progresses.length];
        int[] needDay = new int[progresses.length];

        for (int i = 0; i < progresses.length; i++) {
            lessProgress[i] = 100 - progresses[i];
        }

        for (int i = 0; i < progresses.length; i++) {
            if (lessProgress[i] % speeds[i] == 0) {
                needDay[i] = lessProgress[i] / speeds[i];
            } else {
                needDay[i] = lessProgress[i] / speeds[i] + 1;
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < needDay.length; i++) {
            if (!queue.isEmpty() && queue.peek() < needDay[i]) {
                list.add(queue.size());
                queue.clear();
            }
            queue.offer(needDay[i]);
        }
        list.add(queue.size());

        answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] progress = {95, 90, 99, 99, 80, 99};
        int[] speed = {1, 1, 1, 1, 1, 1};

        solution(progress, speed);
    }
}
