package programmers.level_1;

import java.util.Arrays;

public class Lv1예산 {

    public static int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        int tmp = 0;
        while (answer < budget && tmp < d.length) {
            answer += d[tmp++];
        }

        if (answer > budget) tmp--;

        System.out.println(tmp);
        return tmp;
    }

    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;

        solution(d, budget);
    }
}
