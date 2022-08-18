package programmers.level_1;

import java.util.*;

public class MissRate {

    public static int[] solution(int N, int[] stages) {

        int userCount = stages.length;
        int[] stageCount = new int[N+1];

        for (int i = 0; i < stages.length; i++) {
            if (stages[i] <= N) {
                stageCount[stages[i]]++;
            }
        }

        Map<Integer, Double> map = new HashMap<>();

        for (int i = 1; i < stageCount.length; i++) {

            if (userCount == 0) {
                map.put(i, 0D);
                continue;
            }

            map.put(i, stageCount[i]/(double) userCount);
            userCount -= stageCount[i];
        }

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {

            double max = -1;
            int idx = -1;

            for (int tmp : map.keySet()) {
                double rate = map.get(tmp);
                if (rate > max) {
                    max = rate;
                    idx = tmp;
                }
            }

            for (int tmp : map.keySet()) {
                double rate = map.get(tmp);
                if (rate == max && tmp < idx) {
                    idx = tmp;
                }
            }
            arr[i] = idx;
            map.remove(idx);
        }


        for (int i : arr) {
            System.out.println(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] stages = {1, 1, 1, 1, 1};
        solution(n, stages);
    }

}
