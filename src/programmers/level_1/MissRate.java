package programmers.level_1;

import java.util.*;

public class MissRate {

    public static int[] solution(int N, int[] stages) {
        int[] stageCount = new int[N+1];

        for (int i = 0; i < stages.length; i++) {
            if (stages[i] <= N) stageCount[stages[i]]++;
        }

        Map<Integer, Double> map = new HashMap<>();
        int userCount = stages.length;

        for (int i = 1; i <= N; i++) {
            if (userCount == 0) {
                map.put(i, (double) 0);
                continue;
            }

            double value = stageCount[i] / (double) userCount;
            map.put(i, value);
            userCount -= stageCount[i];
        }

        int[] answer = new int[N];

        for (int i = 0; i < N; i++) {
            int idx = -1;
            double max = -1;

            for (Integer key : map.keySet()) {
                if (map.get(key) > max) {
                    max = map.get(key);
                    idx = key;
                }
            }

            for (Integer key : map.keySet()) {
                if (map.get(key) >= max) {
                    if (key < idx) {
                        idx = key;
                    }
                }
            }

            answer[i] = idx;
            map.remove(idx);
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] stages = {4,4,4,4,4};
        solution(n, stages);
    }

}
