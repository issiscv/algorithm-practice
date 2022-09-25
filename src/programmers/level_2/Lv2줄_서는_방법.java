package programmers.level_2;

import java.util.ArrayList;
import java.util.List;

public class Lv2줄_서는_방법 {

    public static int[] solution(int n, long k) {
        int[] answer = new int[n];

        List<Integer> list = new ArrayList<>();
        int f = 1;
        for (int i = 1; i <= n; i++) {
            list.add(i);
            f = f * i;
        }

        int idx = 0;
        k--;

        while (idx < n) {
            f = f / (n - idx);
            answer[idx++] = list.remove((int)k / f);
            k = k % f;
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(3, 5);
    }
}
