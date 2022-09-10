package programmers.level_2;

import java.util.LinkedList;

public class Lv2_1차_캐시 {

    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;

        if (cacheSize == 0) {
            return cities.length * 5;
        }

        for (int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].toLowerCase();
        }

        LinkedList<String> queue = new LinkedList<>();

        for (int i = 0; i < cities.length; i++) {
            if (queue.isEmpty()) {
                queue.offer(cities[i]);
                answer += 5;
                continue;
            }

            if (queue.contains(cities[i])) {
                int idx = queue.indexOf(cities[i]);
                queue.remove(idx);
                queue.addLast(cities[i]);
                answer += 1;
            } else {
                if (queue.size() < cacheSize) {
                    queue.offer(cities[i]);
                } else {
                    queue.poll();
                    queue.offer(cities[i]);
                }
                answer += 5;
            }
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution(0, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"});
    }

}
