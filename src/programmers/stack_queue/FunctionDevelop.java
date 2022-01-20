package programmers.stack_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FunctionDevelop {

    public static List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        int[] time = new int[progresses.length];

        for (int i = 0; i < progresses.length; i++) {
            if ((100 - progresses[i]) % speeds[i] != 0) {
                time[i] = (100 - progresses[i]) / speeds[i] + 1;
            } else
                time[i] = (100 - progresses[i]) / speeds[i];
        }
//        5  10  1  1  20  1
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < time.length; i++) {
            if (!queue.isEmpty() && queue.peek() < time[i]) {
                list.add(queue.size());
                queue.clear();
            }
            queue.offer(time[i]);
        }

        list.add(queue.size());

        return list;
    }

    public static void main(String[] args) {

        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        solution(progresses, speeds);
    }
}
