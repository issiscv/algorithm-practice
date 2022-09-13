package programmers.level_2;

import java.util.Arrays;
import java.util.Collections;

public class Lv2H_Index {

    public static int solution(int[] citations) {
        int answer = 0;

        int n = citations.length;
        int max = Arrays.stream(citations).max().getAsInt();

        for (int i = 0; i < max; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (citations[j] >= i) count++;
            }

            if (count >= i && n - count <= i) {
                answer = Math.max(answer, i);
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{3, 0, 6, 1, 5});
    }

}
