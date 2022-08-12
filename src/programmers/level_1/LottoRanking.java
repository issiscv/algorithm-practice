package programmers.level_1;

import java.util.ArrayList;
import java.util.List;

public class LottoRanking {

    public static int[] solution(int[] lottos, int[] winNums) {
        int[] answer = new int[2];

        List<Integer> winNumList = new ArrayList<>();

        int zero = 0;
        for (int lotto : lottos) {
            if (lotto == 0) zero ++;
        }

        for (int i = 0; i < winNums.length; i++) {
            winNumList.add(winNums[i]);
        }

        int count = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (winNumList.contains(lottos[i])) count++;
        }

        switch (count) {
            case 2:
                answer[1] = 5;
                break;
            case 3:
                answer[1] = 4;
                break;
            case 4:
                answer[1] = 3;
                break;
            case 5:
                answer[1] = 2;
                break;
            case 6:
                answer[1] = 1;
                break;
            default:
                answer[1] = 6;
                break;
        }

        switch (count + zero) {
            case 2:
                answer[0] = 5;
                break;
            case 3:
                answer[0] = 4;
                break;
            case 4:
                answer[0] = 3;
                break;
            case 5:
                answer[0] = 2;
                break;
            case 6:
                answer[0] = 1;
                break;
            default:
                answer[0] = 6;
                break;
        }

        System.out.println(answer[0] + " " + answer[1]);
        return answer;
    }

    public static void main(String[] args) {
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] winNums = {38, 19, 20, 40, 15, 25};

        solution(lottos, winNums);
    }
}
