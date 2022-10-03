package programmers.level_2;


import java.util.LinkedList;

public class Lv2_1차_캐시 {

    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;

        LinkedList<Object> queue = new LinkedList<>();

        if (cacheSize == 0) {
            return cities.length * 5;
        }

        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();
                
            //큐가 비어있을 때
            if (queue.isEmpty()) {
                queue.offer(city);
                answer += 5;
                continue;
            }

            //캐시가 여유있을 때
            if (queue.size() < cacheSize) {
                //캐시에 있을 때
                if (queue.contains(city)) {
                    int idx = queue.indexOf(city);
                    queue.remove(idx);
                    queue.offer(city);
                    answer += 1;
                } else {//없을 때
                    queue.offer(city);
                    answer += 5;
                }
            } else {
                //캐시에 있을 때
                if (queue.contains(city)) {
                    int idx = queue.indexOf(city);
                    queue.remove(idx);
                    queue.offer(city);
                    answer += 1;
                } else {//없을 때
                    queue.poll();
                    queue.offer(city);
                    answer += 5;
                }
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        String[] cities = {"Jeju", "Jeju"};
        int solution = solution(0, cities);
        System.out.println(solution);
    }

}
