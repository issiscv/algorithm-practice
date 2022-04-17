package programmers.kakao.level1;

import java.util.*;

public class FailRate {


    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] stageCount = new int[N+1];
        Map<Integer, Float> map = new HashMap<>();

        for (int i : stages) {
            if (i == N + 1) continue;
            stageCount[i]++;
        }

        int totalCount = stages.length;
        for (int i = 1; i <= N; i++) {
            if (totalCount == 0) {
                map.put(i, 0f);
                continue;
            }
            map.put(i, (float)stageCount[i] / totalCount);
            totalCount -= stageCount[i];
        }

        for (int i = 0; i < N; i++) {
            int idx = 0;
            float max = -1;

            for (int key : map.keySet()) {
                if (max < map.get(key)) {
                    max = map.get(key);
                    idx = key;
                }
            }
            answer[i] = idx;
            map.remove(idx);
        }

        return answer;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        int[] solution = solution(N, stages);
    }
}
