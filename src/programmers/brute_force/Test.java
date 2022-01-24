package programmers.brute_force;

import java.util.*;

public class Test {

    public static int[] solution(int[] answers) {
        int[] answer = {};
        int max = Integer.MIN_VALUE;

        Queue<Integer> a = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        Queue<Integer> b = new LinkedList<>(Arrays.asList(2, 1, 2, 3, 2, 4, 2, 5));
        Queue<Integer> c = new LinkedList<>(Arrays.asList(3, 3, 1, 1, 2, 2, 4, 4, 5, 5));

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < answers.length; i++) {
            int tmp = answers[i];

            int q = a.poll();//1
            if (q == tmp) {
                map.put(1, map.getOrDefault(1, 0) + 1);
            }
            a.offer(q);

            int w = b.poll();//2
            if (w == tmp) {
                map.put(2, map.getOrDefault(2, 0) + 1);
            }
            b.offer(w);

            int e = c.poll();//3
            if (e == tmp) {
                map.put(3, map.getOrDefault(3, 0) + 1);
            }
            c.offer(e);
        }

        for (int i : map.keySet()) {
            max = Math.max(max, map.get(i));
        }

        for (int i : map.keySet()) {
            if (map.get(i) >= max) {
                list.add(i);
            }
        }
        Collections.sort(list);

        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] answers = {1,3,2,4,2};

        int[] solution = solution(answers);
        for (int i : solution) {
            System.out.println(i);
        }
    }
}
