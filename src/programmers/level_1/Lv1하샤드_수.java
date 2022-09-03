package programmers.level_1;

public class Lv1하샤드_수 {

    public static boolean solution(int x) {

        String s = String.valueOf(x);
        int sum = 0;
        for (String sp : s.split("")) {
            sum += Integer.parseInt(sp);
        }

        if (x % sum == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        boolean solution = solution(13);
        System.out.println(solution);
    }

}
