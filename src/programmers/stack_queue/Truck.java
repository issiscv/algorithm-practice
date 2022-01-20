package programmers.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class Truck {

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
        int sum = 0;
        int time = 0;

        for (int i = 0; i < truck_weights.length; i++) {
            int tmp = truck_weights[i];

            while (true) {
                if (queue.isEmpty()) {
                    queue.offer(tmp);
                    sum += tmp;
                    time++;
                    break;
                } else if (queue.size() == bridge_length){
                    sum -= queue.poll();
                } else {
                    if (sum + tmp <= weight) {
                        queue.offer(tmp);
                        sum += tmp;
                        time++;
                        break;
                    } else {
                        queue.offer(0);
                        time++;
                    }
                }
            }

        }

        return time + bridge_length;
    }

    public static void main(String[] args) {
        int bl = 2;
        int weight = 10;
        int[] tWeight = {7,4,5,6};

        int solution = solution(bl, weight, tWeight);
        System.out.println("solution = " + solution);
    }
}
