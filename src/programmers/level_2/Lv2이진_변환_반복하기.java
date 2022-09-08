package programmers.level_2;

public class Lv2이진_변환_반복하기 {

    public static int[] solution(String s) {
        int[] answer = {};

        int count = 0;
        int idx = 0;
        while (!s.equals("1")) {
            int one = 0;
            for (char c : s.toCharArray()) {
                if (c == '0') count++;
                else one++;
            }

            s = binary(one);
            idx++;
        }

        answer = new int[2];
        answer[0] = idx;
        answer[1] = count;

        return answer;
    }

    private static String binary(int num) {

        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            sb.append(num % 2);
            num = num / 2;
        }

        return sb.reverse().toString();

    }

    public static void main(String[] args) {
        String str = "1111111";
        solution(str);
    }

}
