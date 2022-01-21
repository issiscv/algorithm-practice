package programmers.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class Truck {

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        int time = 0;
        int sum = 0;
        for (int i = 0; i < truck_weights.length; i++) {

            while (true) {

                int truck = truck_weights[i];
                if (queue.isEmpty()) {
                    queue.offer(truck);
                    time++;
                    sum += truck;
                    break;
                } else if (queue.size() == bridge_length) {
                    sum -= queue.poll();
                } else {
                    if (truck + sum <= weight) {
                        queue.offer(truck);
                        sum+= truck;
                        time++;
                        break;
                    } else {
                        queue.offer(0);
                        time++;
                    }
                }
            }
        }
        System.out.println(time + bridge_length);
        return answer;
    }

    public static void main(String[] args) {
        int bl = 2;
        int weight = 10;
        int[] tWeight = {7,4,5,6};

        int solution = solution(bl, weight, tWeight);
        System.out.println("solution = " + solution);
    }
}
