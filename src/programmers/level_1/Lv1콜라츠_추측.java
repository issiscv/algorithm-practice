package programmers.level_1;

public class Lv1콜라츠_추측 {

    private static int answer = 0;

    public static int solution(long num) {

        recursive(num, 0);

        return answer;
    }

    private static void recursive(long num, int count) {


        if (count >= 500) {
            answer = -1;
            return;
        }

        if (num == 1) {
            answer = count;
            return;
        }

        if (num % 2 == 0) {
            recursive(num / 2, count+1);
        } else {
            recursive(num * 3 + 1, count+1);
        }
    }

    public static void main(String[] args) {
        int solution = solution(626331);
        System.out.println(solution);
    }

}
