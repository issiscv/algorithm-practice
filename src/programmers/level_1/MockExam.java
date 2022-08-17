package programmers.level_1;

import java.util.*;

public class MockExam {

    public static int[] solution(int[] answers) {


        Queue<Integer> one = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        Queue<Integer> two = new LinkedList<>(Arrays.asList(2, 1, 2, 3, 2, 4, 2, 5));
        Queue<Integer> three = new LinkedList<>(Arrays.asList(3, 3, 1, 1, 2, 2, 4, 4, 5, 5));

        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < answers.length; i++) {

            int a = one.poll();

            if (a == answers[i]) {
                map.put(1, map.getOrDefault(1, 0) + 1);
            }

            one.offer(a);

            int b = two.poll();

            if (b == answers[i]) {
                map.put(2, map.getOrDefault(2, 0) + 1);
            }

            two.offer(b);

            int c = three.poll();

            if (c == answers[i]) {
                map.put(3, map.getOrDefault(3, 0) + 1);
            }

            three.offer(c);
        }

        int max = Integer.MIN_VALUE;

        for (Integer tmp : map.keySet()) {
            max = Math.max(max, map.get(tmp));
        }
    
        List<Integer> list = new ArrayList<>();
        
        for (Integer tmp : map.keySet()) {
            int a = map.get(tmp);
            if (a >= max) {
                list.add(tmp);
            }
        }

        Collections.sort(list);

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }


        return answer;
    }

    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};
        solution(answers);
    }
}
