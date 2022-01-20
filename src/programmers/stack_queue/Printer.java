package programmers.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {

    static class Priority {
        int p;
        int l;

        public Priority(int priority, int location) {
            this.p = priority;
            this.l = location;
        }
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Priority> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Priority(priorities[i], i));
        }
        int idx = 0;
        while (!queue.isEmpty()) {
            Priority tmp = queue.poll();

            Boolean flag = true;
            for (Priority priority : queue) {
                if (priority.p > tmp.p) {
                    queue.offer(tmp);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                idx++;
                if (tmp.l == location) return idx;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] p = {1, 1, 9, 1, 1, 1};
        int l = 0;

        System.out.println(solution(p, l));
    }
}
