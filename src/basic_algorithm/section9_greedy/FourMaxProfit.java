package basic_algorithm.section9_greedy;

import java.util.*;

public class FourMaxProfit {

    static class Conference implements Comparable<Conference> {
        int pay;
        int day;

        public Conference(int pay, int day) {
            this.pay = pay;
            this.day = day;
        }

        @Override
        public int compareTo(Conference o) {
            return o.day-this.day;
        }
    }
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Conference> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            max = Math.max(b, max);
            list.add(new Conference(a, b));
        }

        Collections.sort(list);

        System.out.println(solution(list));
    }

    private static int solution(List<Conference> list) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int j = 0;
        int answer = 0;
        for (int i = max; i > 0; i--) {
            for ( ;j < list.size(); j++) {
                if (list.get(j).day < i) break;
                queue.offer(list.get(j).pay);
            }
            if (!queue.isEmpty())
                answer += queue.poll();
        }
        return answer;
    }


}
