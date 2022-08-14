package programmers.level_1;

public class AddMinusPlus {

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer += -absolutes[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] absolute = {4, 7, 12};
        boolean[] signs = {true, false, true};

        solution(absolute, signs);
    }
}
