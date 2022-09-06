package programmers.level_2;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lv2프린터 {

    private static class Node {
        private int priority;
        private int order;

        public Node(int priority, int order) {
            this.priority = priority;
            this.order = order;
        }

    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Node> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new Node(priorities[i], i));
        }

        int count = 0;

         while (!queue.isEmpty()) {

             Node poll = queue.poll();
             boolean flag = false;
             for (Node node : queue) {
                 if (node.priority > poll.priority) {
                    queue.offer(poll);
                    flag = true;
                    break;
                 }
             }

             if (!flag) {
                 count +=1;
                 if (location == poll.order) {
                     break;
                 }
             }

         }


        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1, 1, 9, 1, 1, 1}, 0);
    }

}
