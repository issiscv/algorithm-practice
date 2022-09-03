package programmers.level_1;

public class Lv1짝수와_홀수 {

    public static String solution(int num) {

        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        String solution = solution(3);
        System.out.println(solution);
    }

}
